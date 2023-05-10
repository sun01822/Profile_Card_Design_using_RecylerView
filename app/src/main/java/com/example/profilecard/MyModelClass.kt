package com.example.profilecard

import android.provider.ContactsContract

data class MyModelClass(
    var profile: String ?= null,
    var name: String? = null,
    var email: String? = null,
    var about: String? = null,
    var view: String? = null,
    var rank: String? = null,
    var downloads: String? = null,
    var description: String? = null,
    var follow:String ? = null,
)
