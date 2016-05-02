'use strict';
app.factory('homeService',['$http','config', function($http,config) {
    return {
    	searchPinCode: function(searchKey) { 
    		var promise  = $http.get(config.apiUrl+'getpin',{params: {searchKey: searchKey}}).
            then(function(response) {
                return response.data;
            });
			return promise ;
		}
    };
}]);







