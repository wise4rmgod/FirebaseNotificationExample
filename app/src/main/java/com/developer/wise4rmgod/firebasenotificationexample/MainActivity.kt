package com.developer.wise4rmgod.firebasenotificationexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.messaging.FirebaseMessaging
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var TAG  = "Main Activity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//Get the token
        //Use the token only for received a push notification this device
        var token = FirebaseInstanceId.getInstance().token
        Log.d(TAG,"Token : "+token)
        var bodyMessage= intent.getStringExtra("Notification")
        Toast.makeText(this,token,Toast.LENGTH_SHORT).show()
        if(bodyMessage != null){
            body_text_view.text = bodyMessage
        }


    }




}
