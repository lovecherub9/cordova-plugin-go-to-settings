package org.apache.cordova.plugin;

import android.content.Intent;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;

/**
 * This class echoes a string called from JavaScript.
 */
public class GoToSettingsPlugin extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) {
        if (action.equals("goToSettings")) {
            cordova.getActivity().startActivity(new Intent((android.provider.Settings.ACTION_SETTINGS)));
        }
        return true;
    }
}
