var WeatherControllerModule = (function () {
  

//------------------Metodos Get---------------
  
  var getWeather = function (city) {
    
    var callback = {

        onSuccess: function(weather){
                        
			document.getElementById("coord").innerHTML+='<h2>'+JSON.stringify(weather.coord)+'</h2>';
                        document.getElementById("weather").innerHTML+='<h2>'+JSON.stringify(weather.weather)+'</h2>';
                        document.getElementById("main").innerHTML+='<h2>'+JSON.stringify(weather.main)+'</h2>';
                        
                        
                        
            },
        onFailed: function(exception){
		alert(exception);
        alert("Hubo un problema al cargar los indices");
        }
    }
    RestControllerModule.getWeather(city,callback);
  };
  return {
        getWeather: getWeather
  };

})();