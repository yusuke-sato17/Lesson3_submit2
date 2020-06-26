package jp.techacademy.yusuke.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human(name = "佐藤", age = 22, hobby = "晩ご飯")

        human.say()
        human.think()

        val human2 = Human(name = "鈴木", age = 60, hobby = "読書")

        human2.say()
        human2.think()
    }
}