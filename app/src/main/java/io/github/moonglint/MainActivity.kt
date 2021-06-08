package io.github.moonglint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    private lateinit  var trueButton:Button
    private lateinit var falseButton:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)

        trueButton.setOnClickListener { view:View->
            Toast.makeText(this,R.string.toast_write,Toast.LENGTH_LONG)
        }
        falseButton.setOnClickListener { view:View->
            Toast.makeText(this,R.string.toast_wrong,Toast.LENGTH_SHORT)
        }
    }
}