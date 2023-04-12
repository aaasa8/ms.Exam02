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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

		binding.myCustomView.setOnTouchListener(  )

    }

	inner class MyTouch : View.onTouchListener{
		override fun onTouch(p0: View?, p1: MotionEvent?): Boolean {
			binding.myCustomView.posX=
		return true	
	}

	inner class MyClick : View.OnLongClickListener{
		override fun onLongClick(p0: View?): Boolean {
		true
		}


}