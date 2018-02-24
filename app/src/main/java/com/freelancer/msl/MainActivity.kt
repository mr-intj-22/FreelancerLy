package com.freelancer.msl

import android.content.Intent
import android.os.Bundle
import com.freelancer.msl.core.MyApp
import com.freelancer.msl.extra.OrientedActivity
import com.freelancer.msl.login.LoginActivity


class MainActivity : OrientedActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        checkUser()
        setContentView(R.layout.activity_main)
    }

    private fun checkUser() {
        if (MyApp().auth == null) {
            /*
            check if the user is logged in, if not got to LoginActivity, otherwise continue.
             */
            finish()
            val i = Intent(this, LoginActivity::class.java)
            i.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(i)
        }
    }
}
