package com.doyou.cvc.release

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.doyou.cv.utils.Utils
import com.doyou.cvc.DispatchManager
import com.doyou.cvc.R
import com.doyou.cvc.release.taperchart.TaperChartActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        syncHorBarViewData()
        imgTxtBtn.setOnClickListener{
            DispatchManager.showAct(this, ImgTxtMixtureActivity::class.java)
        }
        ringvBtn.setOnClickListener{
            DispatchManager.showAct(this, RingViewActivity::class.java)
        }
        tcBtn.setOnClickListener {
            DispatchManager.showAct(this, TaperChartActivity::class.java)
        }
        gradientBtn.setOnClickListener {
            DispatchManager.showAct(this, GradientLineActivity::class.java)
        }
        lrvBtn.setOnClickListener {
//            DispatchManager.showAct(this, LegendRingViewActivity::class.java)
            DispatchManager.showAct(this, LegendRingViewActivity::class.java)
        }
        cpbvBtn.setOnClickListener {
            DispatchManager.showAct(this,CircleProgressBarViewActivity::class.java)
        }
        spbBtn.setOnClickListener {
            DispatchManager.showAct(this,ShadowProBarActivity::class.java)
        }
        hcpvBtn.setOnClickListener {
            DispatchManager.showAct(this,HalfCircleProViewActivity::class.java)
        }
        matrixBtn.setOnClickListener {
            DispatchManager.showAct(this,MatrixImageViewActivity::class.java)
        }
        gpbBtn.setOnClickListener {
            DispatchManager.showAct(this,GradientProBarActivity::class.java)
        }
        hssvBtn.setOnClickListener {
            DispatchManager.showAct(this,HorScrollSelecteViewActivity::class.java)
        }
        horBtn.setOnClickListener{
            DispatchManager.showAct(this,HorProBarActivity::class.java)
        }
    }

    private fun syncHorBarViewData(){
        var one = 24.5f
        var total = 49
        Utils.logD("201811211646","(one / total) = " + (one / total))
        horbarV.progress = ((one / total) * 100).toInt() // 注意：不要忘记设置xml中的style，不然进度没有效果
    }
}
