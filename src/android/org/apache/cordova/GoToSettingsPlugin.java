/**
 */
package org.apache.cordova;

import android.content.Intent;

import org.json.JSONArray;
import org.json.JSONException;

public class GoToSettingsPlugin extends CordovaPlugin {

  public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
    if(action.equals("goToSettings")) {
        cordova.getActivity().startActivity(new Intent((android.provider.Settings.ACTION_SETTINGS)));
    } 
    return true;
  }

}
