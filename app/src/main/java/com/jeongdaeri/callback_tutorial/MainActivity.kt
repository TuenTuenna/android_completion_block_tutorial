package com.jeongdaeri.callback_tutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log

class MainActivity : AppCompatActivity() {

    val TAG: String = "로그"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "MainActivity - onCreate() called")


        someCallBackMethod_1(completion = {
            Log.d(TAG, "MainActivity - 컴플레션 블럭 호출됨 / it : $it")
            someCallBackMethod_2 {
                someCallBackMethod_3 {
                    someCallBackMethod_4 {
                        someCallBackMethod_5 {
                            someCallBackMethod_6 {
                                someCallBackMethod_7 {
                                    someCallBackMethod_8 {
                                        Log.d(TAG, "MainActivity - onCreate() called")
                                    }
                                }
                            }
                        }
                    }
                }
            }
        })
    }


    fun someCallBackMethod_1(completion: (String) -> Unit){
        Log.d(TAG, "MainActivity - someCallBackMethod() called")
        Handler().postDelayed({
            completion("하하 끝났다.")
        }, 3000L)
    }

    fun someCallBackMethod_2(completion: (String) -> Unit){
        Log.d(TAG, "MainActivity - someCallBackMethod() called")
        Handler().postDelayed({
            completion("하하 끝났다.")
        }, 3000L)
    }
    fun someCallBackMethod_3(completion: (String) -> Unit){
        Log.d(TAG, "MainActivity - someCallBackMethod() called")
        Handler().postDelayed({
            completion("하하 끝났다.")
        }, 3000L)
    }
    fun someCallBackMethod_4(completion: (String) -> Unit){
        Log.d(TAG, "MainActivity - someCallBackMethod() called")
        Handler().postDelayed({
            completion("하하 끝났다.")
        }, 3000L)
    }
    fun someCallBackMethod_5(completion: (String) -> Unit){
        Log.d(TAG, "MainActivity - someCallBackMethod() called")
        Handler().postDelayed({
            completion("하하 끝났다.")
        }, 3000L)
    }
    fun someCallBackMethod_6(completion: (String) -> Unit){
        Log.d(TAG, "MainActivity - someCallBackMethod() called")
        Handler().postDelayed({
            completion("하하 끝났다.")
        }, 3000L)
    }
    fun someCallBackMethod_7(completion: (String) -> Unit){
        Log.d(TAG, "MainActivity - someCallBackMethod() called")
        Handler().postDelayed({
            completion("하하 끝났다.")
        }, 3000L)
    }
    fun someCallBackMethod_8(completion: (String) -> Unit){
        Log.d(TAG, "MainActivity - someCallBackMethod() called")
        Handler().postDelayed({
            completion("하하 끝났다.")
        }, 3000L)
    }


}
