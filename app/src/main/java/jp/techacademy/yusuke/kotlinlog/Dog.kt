package jp.techacademy.yusuke.kotlinlog

import android.util.Log

abstract class Dog: Animal {

    constructor(name: String, age: Int): super(name, age) {
    }

    override fun say() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }

    fun move() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "は全力で走った。")
    }
}