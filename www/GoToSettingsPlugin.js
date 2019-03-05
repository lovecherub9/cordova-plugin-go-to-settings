var exec = require('cordova/exec');

exports.goToSettings = function (success, error) {
    exec(success, error, 'GoToSettingsPlugin', 'goToSettings');
};
