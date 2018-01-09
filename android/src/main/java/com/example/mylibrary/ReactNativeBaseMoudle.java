package com.example.mylibrary;

import android.content.Context;
import android.support.v4.content.ContextCompat;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/**
 * Created by ywf on 2018/1/9.
 */

public class ReactNativeBaseMoudle extends ReactContextBaseJavaModule {
    private Context context;

    public ReactNativeBaseMoudle(ReactApplicationContext reactContext) {
        super(reactContext);
        this.context = reactContext;
    }

    @Override
    public String getName() {
        return "mylibrary";
    }

    @ReactMethod
    public void testPermission(Promise promise) {
        String content = "少时诵诗书所所所所所";
        promise.resolve(content);
    }


}
