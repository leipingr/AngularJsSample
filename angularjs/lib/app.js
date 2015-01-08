/**
 * Created by reifurther on 14/11/13.
 */
angular.module('fifaApp', ['ngRoute'])
.config(function($routeProvider) {
        $routeProvider.when('/', {
            templateUrl: '../AngularJsBook/chapter10/views/teams_list.html',
            controller: 'TeamListCtrl as teamListCtrl'
        })
            .when('/login', {
                templateUrl: '../AngularJsBook/chapter10/views/login.html'
            })
            .when('/team/:code', {
                templateUrl: 'views/team_details.html',
                controller: 'TeamDetailsCtrl as teamDetailsCtrl',
                resolve: {
                    auth: ['$q', '$location', 'UserService',
                        function($q,$location,UserService){
                            return UserService.session().then(
                                function(success) {},
                                function(err){
                                    $location.path('/login');
                                    $location.replace();
                                    return $q.reject(err);
                                }
                            );
                        }
                    ]
                }
            });
        $routeProvider.otherwise({
            redirectTo: '/'
        });
    });