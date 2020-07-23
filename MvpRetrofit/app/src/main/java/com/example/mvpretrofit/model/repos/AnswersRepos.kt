package com.example.mvpretrofit.model.repos

import android.util.Log
import android.widget.Toast
import com.example.mvpretrofit.`interface`.AnswersInterface
import com.example.mvpretrofit.model.api.AnswersAPI
import com.example.mvpretrofit.model.api.AnswersServices
import com.example.mvpretrofit.model.modelClass.SOAnswersResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class AnswersRepos : AnswersInterface.answersModel {
    private  var answers  = "bbb"


    private var apiclient: AnswersServices? = null

    init {
        apiclient = AnswersAPI.client.create(AnswersServices::class.java)
    }


    override fun getAnswersByString(tag: String, presenter: AnswersInterface.answersPresenter) {
        val call = apiclient?.getAnswers(tag)
        Log.d("TAG",tag);

        call?.enqueue(object : Callback<SOAnswersResponse> {
            override fun onFailure(call: Call<SOAnswersResponse>?, t: Throwable?) {
                Log.d("failure", t.toString())
            }

            override fun onResponse(call: Call<SOAnswersResponse>?, response: Response<SOAnswersResponse>?) {
                if (response?.isSuccessful!!) {
                    var results = response?.body()?.items?.get(0)?.owner?.display_name
                    Log.d("success", results.toString())
                    //    countryTV?.setText(results)
                    answers = results.toString()

                    presenter.uiAutoUpdate()

                }


            }


        })
    }

    override fun getAnswers(): String = answers

}