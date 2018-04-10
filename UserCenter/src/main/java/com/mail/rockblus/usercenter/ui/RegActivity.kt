package com.mail.rockblus.usercenter.ui

import android.os.Bundle
import com.mail.rockblus.base.ui.activity.BaseMvpActivity
import com.mail.rockblus.usercenter.R
import com.mail.rockblus.usercenter.presenter.RegisterPresenter
import com.mail.rockblus.usercenter.presenter.view.RegisterView
import kotlinx.android.synthetic.main.activity_reg.*

class RegActivity : BaseMvpActivity<RegisterPresenter>(), RegisterView {

    override fun onRegisterResult(result: Boolean) {
        println("22")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg)


        buttonReg.setOnClickListener{
            println("2222")
            val mPr = RegisterPresenter()
            mPr.mView = this
            mPr.register("11", "22")
        }
    }
}
