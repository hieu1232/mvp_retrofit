package com.example.mvpretrofit.model.api

import com.example.mvpretrofit.`interface`.Constant
import com.example.mvpretrofit.model.modelClass.SOAnswersResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface AnswersServices {

    @GET(Constant.ANSWERS)
    fun getAnswers(@Query("tagged")  tags : String): Call<SOAnswersResponse>
}