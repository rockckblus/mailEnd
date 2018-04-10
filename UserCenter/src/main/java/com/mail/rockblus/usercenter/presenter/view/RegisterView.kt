package com.mail.rockblus.usercenter.presenter.view

import com.mail.rockblus.base.presenter.view.BaseView

interface RegisterView : BaseView {
    fun onRegisterResult(result: Boolean)
}