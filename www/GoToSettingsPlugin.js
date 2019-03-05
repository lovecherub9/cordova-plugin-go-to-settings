var exec = require('cordova/exec');

exports.goToSettings = function () {
    exec('GoToSettingsPlugin', 'goToSettings', null);
};
