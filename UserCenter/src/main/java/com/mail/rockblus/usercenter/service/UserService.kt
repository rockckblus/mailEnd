package com.mail.rockblus.usercenter.service

import rx.Observable


interface UserService {
    fun register(mobile: String, verifyCode: String): Observable<Boolean>
}