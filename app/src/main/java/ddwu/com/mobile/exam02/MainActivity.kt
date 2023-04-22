package ddwu.com.mobile.exam02

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.Toast
import ddwu.com.mobile.exam02.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

		val colors = arrayIf("Red", "Cyan", "Blue")
		var selectedColor = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//실습07
binding.myCustomView.setOnLongClickListener {
		AlertDialog.Builder(this).run{
			setTitle("색상 선택")
			setSingleChoiceItems(colors, selectedColor, object: DialogInterface.OnClickListener{
				override fun onClick(dialog: DialogInterface?, which: Int){
					selectedColor = which
				}
			})
			setPositiveButton("확인", object: DialogInterface.OnClickListener{
				override fun onClick(dialog: DialogInterface?, which: Int){
					when (selectedColor) {
						0 -> binding.myCustomView.painColor = Color.RED
						1 -> binding.myCustomView.painColor = Color.CYAN
						2 -> binding.myCustomView.painColor = Color.BLUE
					}
					binding.myCustomView.invalidate()
				}
			})
			setNegative("취소", null)
			show()
		}
		true
	}



				//A -> B로 가려먼 touch에서 이벤트가 끝나면 안됨! return false 람다함수면 return 생략
				binding.myCustomView.setOnTouchListener({
					v: View?, event: MotionEvent? ->
					binding.myCustomView.posX = event!!.x
					binding.myCustomView.posY = event!!.y
					binding.myCustomView.invalidate()
					false
				})
				binding.myCustomView.setOnLongClickListener(MyLongClick())
    }
/* A) 리스너를 이용한 방법
	inner class MyTouch : View.onTouchListener{
		override fun onTouch(p0: View?, p1: MotionEvent?): Boolean {
			binding.myCustomView.posX = event!!.x
			binding.myCustomView.posY = event!!.y
			binding.myCustomView.invalidate()
			return false
		}
	}*/
//B) 색을 바꾸는 LongClick 구현해보기
	inner class MyClick : View.OnLongClickListener{
		override fun onLongClick(p0: View?): Boolean {
			binding.myCustomView.paintColor = Color.RED
			return true
		}
	}


}