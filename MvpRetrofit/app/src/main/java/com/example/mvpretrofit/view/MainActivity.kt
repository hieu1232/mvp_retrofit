package com.example.mvpretrofit.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mvpretrofit.R
import com.example.mvpretrofit.`interface`.AnswersInterface
import com.example.mvpretrofit.presenter.AnswersPresenter
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), AnswersInterface.answersView {


    override fun updateViewData() {
        textView.setText(presenter?.showAnswers())
    }


    private var capitalName: String? = null
    private var presenter: AnswersPresenter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        initialize()
        button.setOnClickListener {
            capitalName = editText!!.text!!.toString()
//            Log.d("countynameMain", capitalName)
            presenter?.networkcall(capitalName!!)
        }
    }


    fun initialize() {
        presenter = AnswersPresenter(this)

    }


}

