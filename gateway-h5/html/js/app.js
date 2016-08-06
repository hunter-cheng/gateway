var app = angular.module('myApp', []);
app.controller('personCtrl', function($scope) {
  $scope.toggle=function(){
	  $http.get("htt://127.0.0.1:81/proxy/gateway-api/login?name=aaaa&password=bbbb")
	  .success(function (response) {$scope.names = response.records;});
  }
})
