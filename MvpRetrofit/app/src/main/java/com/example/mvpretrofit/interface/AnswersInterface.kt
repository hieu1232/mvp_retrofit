package com.example.mvpretrofit.`interface`

interface AnswersInterface {

    interface answersModel {
        fun getAnswersByString(tag: String, presenter: answersPresenter)
        fun getAnswers(): String
    }

    interface answersView {
        fun updateViewData()

    }

    interface answersPresenter {
        fun networkcall(tag: String)
        fun showAnswers() : String
        fun uiAutoUpdate()
    }
}