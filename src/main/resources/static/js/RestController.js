var RestControllerModule = (function () {
//------------------Metodos Get------
  
  var getWeather = function(city, callback){			
	axios.get('https://arswparcialjuanjose.herokuapp.com/apiweather/'+city)		
		.then(function(order){
			callback.onSuccess(order.data);			
		})
		.catch(function(error){
			callback.onFailed(error);
		});
	};


  return {
	getWeather: getWeather
    
  };

})();