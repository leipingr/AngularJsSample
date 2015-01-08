/**
 * Created by reifurther on 14/12/4.
 */

angular.module('appModule',[]).
    controller('PhoneController', function($scope, $http){
//        var phones = [
//            {name: 'Nexus S', describe: 'Fast just got faster with Nexus S.', age: 1},
//            {name: 'Motorola XOOM™ with Wi-Fi', describe: 'The Next, Next Generation tablet.', age: 2},
//            {name: 'MOTOROLA XOOM™', describe: 'The Next, Next Generation tablet.', age: 3}
//        ];
//
//        $scope.phones = phones;

        $http.get('http://172.17.234.75:8080/rest/json/phone/get').success(function(data){
            $scope.phones = data;
        })

        $scope.orderProp = 'age';
    });