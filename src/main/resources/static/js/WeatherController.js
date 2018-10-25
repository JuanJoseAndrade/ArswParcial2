var WeatherControllerModule = (function () {
  
  var loadOrder=function (order,elemento) {
	if ( Object.keys(order.orderAmountsMap).length>0){
		var nombre="Order"+order.tableNumber;
		var nuevaTabla='<div id='+nombre+'>';
		nuevaTabla+='<h2>'+nombre+'</h2>';
		nuevaTabla+='<table class="table table-striped table-sm"> <thead> <tr> <th> Product </th> <th> Quantity </th> </tr> </thead> <tbody>';
		for (i in order.orderAmountsMap) {
			nuevaTabla += '<tr>';
			nuevaTabla += '<td>'+i+'<td>';
			nuevaTabla += '<td>'+order.orderAmountsMap[i]+'<td>';
			nuevaTabla += '</tr>';
		}
		nuevaTabla += '</tbody></table></div>';
		document.getElementById(elemento).innerHTML+=nuevaTabla;
	}
	};
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