'use strict';
app.controller('homeCtrl', ['$scope','homeService', function ($scope,homeService) {

	$scope.errorMessage = "";
    $scope.searchPinCode = function() {
    	homeService.searchPinCode($scope.searchKey).then(function(pincodes) {
    		if(pincodes != ""){
		    	$scope.pincodes = pincodes;	
		    	$scope.errorMessage = "";
    		}else{
    			$scope.errorMessage = "No pin code found";
    		}    	
    	});
    };
}]);