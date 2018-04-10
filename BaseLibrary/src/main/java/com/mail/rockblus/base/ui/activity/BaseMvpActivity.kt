package com.mail.rockblus.base.ui.activity

import com.mail.rockblus.base.presenter.BasePresenter
import com.mail.rockblus.base.presenter.view.BaseView

open class BaseMvpActivity<T : BasePresenter<*>> : BaseActivity(), BaseView {
    override fun showLoading() {
    }

    override fun hideLoading() {
    }

    override fun onError() {
    }

    lateinit var mBasePresenter: T
}