package com.mail.rockblus.usercenter.presenter

import com.mail.rockblus.base.presenter.BasePresenter
import com.mail.rockblus.usercenter.presenter.view.RegisterView

open class RegisterPresenter : BasePresenter<RegisterView>() {
    fun register(mobile: String, verifyCode: String) {
        //业务逻辑
        mView.onRegisterResult(true)
    }
}