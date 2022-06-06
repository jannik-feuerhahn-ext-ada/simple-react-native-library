package com.simplereactnativelibrary

import com.facebook.react.bridge.*

import android.util.Log

class SimpleReactNativeLibraryModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {

    override fun getName(): String {
        return "SimpleReactNativeLibrary"
    }

    // Example method
    // See https://reactnative.dev/docs/native-modules-android
    @ReactMethod
    fun launchSDK(url: String, callback: Callback) {
    
      // val intent = Intent(reactApplicationContext, AdaModalActivity::class.java)
      // val params = AdaParameters(
      //     url = url,
      //     locale = "en-US"
      // )
      // intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
      // intent.putExtra("adaParameters", params)

      // reactApplicationContext.startActivity(intent)

      val msg = "Launched SDK with url: $url"
      Log.d(SimpleReactNativeLibraryModule::class.simpleName, msg)
      callback.invoke(null, msg)
    
    }

    
}
