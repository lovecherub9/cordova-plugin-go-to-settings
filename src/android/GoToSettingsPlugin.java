package cordova-plugin-go-to-settings;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class GoToSettingsPlugin extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("goToSettings")) {
            startActivity(new Intent(android.provider.Settings.ACTION_SETTINGS));
            return true;
        }
        return false;
    }
}
