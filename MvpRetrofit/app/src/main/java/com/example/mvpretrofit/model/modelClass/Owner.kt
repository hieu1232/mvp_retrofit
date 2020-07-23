package com.example.mvpretrofit.model.modelClass

import com.google.gson.annotations.SerializedName

data class Owner (

	@SerializedName("reputation") val reputation : Int,
	@SerializedName("user_id") val user_id : Int,
	@SerializedName("user_type") val user_type : String,
	@SerializedName("accept_rate") val accept_rate : Int,
	@SerializedName("profile_image") val profile_image : String,
	@SerializedName("display_name") val display_name : String,
	@SerializedName("link") val link : String
)