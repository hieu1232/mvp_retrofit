package com.example.mvpretrofit.presenter


import com.example.mvpretrofit.`interface`.AnswersInterface
import com.example.mvpretrofit.model.repos.AnswersRepos

class AnswersPresenter(answersView: AnswersInterface.answersView) : AnswersInterface.answersPresenter {


    private var view: AnswersInterface.answersView = answersView
    private var model: AnswersInterface.answersModel = AnswersRepos()


    override fun uiAutoUpdate() {
        view.updateViewData()
    }

    override fun networkcall(tag: String) {
        model?.getAnswersByString(tag, this)
    }

    override fun showAnswers() = model.getAnswers()

}