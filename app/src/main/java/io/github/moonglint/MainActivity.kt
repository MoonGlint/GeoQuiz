package io.github.moonglint

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.annotation.StringRes


class MainActivity : AppCompatActivity() {
    private lateinit  var trueButton:Button
    private lateinit var falseButton:Button
    @SuppressLint("ShowToast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         setContentView( R.layout.activity_main)
        trueButton = findViewById(R.id.true_button)
         falseButton = findViewById(R.id.false_button)


        trueButton.setOnClickListener { view:View->
            Toast.makeText(this,R.string.toast_write,Toast.LENGTH_LONG).show()
        }

        //E/Toast: setGravity() shouldn't be called on text toasts, the values won't be used
        falseButton.setOnClickListener { view:View->
         val toast=Toast.makeText(this,R.string.toast_wrong,Toast.LENGTH_LONG)
            toast.setGravity(Gravity.TOP,0,0)
            toast.show()


        }
    }
}