var exec = require('cordova/exec');

var PLUGIN_NAME = 'GoToSettingsPlugin';

var GoToSettingsPlugin = {
  saveToGooglePay: function(successCallback, errorCallback) {
    var args = {};
    exec(successCallback, errorCallback, PLUGIN_NAME, 'goToSettings', [args]);
  },
};

module.exports = GoToSettingsPlugin;