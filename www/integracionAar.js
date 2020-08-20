var aarintegration = {
    check: function (successCallback, errorCallback) {
      cordova.exec(successCallback, errorCallback, 'IntegracionAar', 'check', []);
    }
  }
  
  cordova.addConstructor(function () {
    if (!window.plugins) {window.plugins = {};}
  
    window.plugins.integracionaar = integracionaar;
    return window.plugins.integracionaar;
  });