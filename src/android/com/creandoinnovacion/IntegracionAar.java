package com.creandoinnovacion;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;

public class IntegracionAar extends CordovaPlugin {

    private int MY_PERMISSIONS_REQUEST = 0;

    private JSONArray arrayGPS = new JSONArray();
    private JSONObject objGPS = new JSONObject();

    @Override
    public boolean execute(String action, JSONArray data, final CallbackContext callbackContext) throws JSONException {

        if (action.equals("check")) {
            String testText = "Hello my Friend";
            int count = ReadText.numVowels(testText);
            callbackContext.success(count);
          return true;
        }else {
          return false;
        }
    }
}
