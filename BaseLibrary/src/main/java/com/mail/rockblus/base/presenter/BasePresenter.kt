package com.mail.rockblus.base.presenter

import com.mail.rockblus.base.presenter.view.BaseView

open class BasePresenter<T : BaseView> {
    lateinit var mView: T
}