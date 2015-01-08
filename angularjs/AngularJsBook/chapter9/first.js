/**
 * Created by reifurther on 14/11/28.
 */

var items = [
    {name:'Paint pots', quatity: 8, price: 3.95},
    {name:'Polka dots', quatity: 17, price: 12.95},
    {name:'Pebbles', quatity:6.95, price:6.95}
];

var myAppModule = angular.module('myApp', []);

myAppModule.controller('firstCtrl', function($scope) {
        $scope.items = items;

        $scope.count = function(){
            var total = 0 ;
            for(var i= 0, len = $scope.items.length ; i<len ; i++){
                total = total + $scope.items[i].price * $scope.items[i].quatity;
            }

            return total;
        }

        $scope.discount = function() {
           return $scope.count() - $scope.count() * 0.1 ;
        }

    });