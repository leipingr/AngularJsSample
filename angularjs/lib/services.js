/**
 * Created by reifurther on 14/11/13.
 */
angular.module('fifaApp')
    .factory('FifaService', ['$http',
        function($http){
            return {
                getTeams: function(){
                    return $http.get ('http://172.17.234.75:8000/api/team');
                },

                getTeamDetails: function(code){
                    return $http.get('http://172.17.234.75:8000/api/team' + code);
                }
            }
        }
    ])
    .factory('UserService', ['$http', function($http) {
        var service = {
            isLogginIn: false,
            session: function(){
                return $http.get('http://172.17.234.75:8000/api/session')
                    .then(function(response){
                        service.isLogginIn = true;
                        return response;
                    });
            },
            login: function(usr){
                return $http.post('http://172.17.234.75:8000/api/login',user)
                    .then(function(response){
                        service.isLogginIn = true;
                        return response;
                    });
            }
        };
        return service;
    }]);
