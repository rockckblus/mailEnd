package com.mail.rockblus.usercenter.service.impl

import com.mail.rockblus.usercenter.service.UserService
import rx.Observable

class UserServiceImpl : UserService {
    override fun register(mobile: String, verifyCode: String): Observable<Boolean> {
    }
}