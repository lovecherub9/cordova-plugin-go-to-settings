
var exec = require('cordova/exec');

var PLUGIN_NAME = 'GoToSettingsPlugin';

var MyCordovaPlugin = {
  goToSettings: function(cb) {
    exec(cb, null, PLUGIN_NAME, 'goToSettings', []);
  }
};

module.exports = MyCordovaPlugin;
