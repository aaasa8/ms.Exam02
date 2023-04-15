package ddwu.com.mobile.exam02

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View

class MyCustomView : View {

    var posX = 100f
    var posY = 100f
    var r = 100f
    var paintColor = Color.CYAN

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int)
            : super(context, attrs, defStyleAttr)


    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas?.drawColor(Color.LTGRAY)

        val paint = Paint()
        paint.setColor(paintColor)

        canvas?.drawCircle(posX, posY, r, paint)
    }

/*터치하는 곳으로 원 이동
	override fun onTouchEvent(event: MotionEvent?): Boolean {
		posX = event!!.x //null값이면 안되기 때문에 !! 추가
		posY = event!!.y
		invalidate()
		return true
	}*/


}