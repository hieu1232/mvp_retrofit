package com.example.mvpretrofit.model.modelClass

import com.google.gson.annotations.SerializedName


data class Items (

	@SerializedName("owner") val owner : Owner,
	@SerializedName("is_accepted") val is_accepted : Boolean,
	@SerializedName("score") val score : Int,
	@SerializedName("last_activity_date") val last_activity_date : Int,
	@SerializedName("last_edit_date") val last_edit_date : Int,
	@SerializedName("creation_date") val creation_date : Int,
	@SerializedName("answer_id") val answer_id : Int,
	@SerializedName("question_id") val question_id : Int,
	@SerializedName("content_license") val content_license : String
)