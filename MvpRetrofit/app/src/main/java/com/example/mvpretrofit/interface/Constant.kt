package com.example.mvpretrofit.`interface`

interface Constant {
    companion object {
        const val BASE_URL = "https://api.stackexchange.com/2.2/"
        const val ANSWERS = "/answers?order=desc&sort=activity&site=stackoverflow"
    }
}