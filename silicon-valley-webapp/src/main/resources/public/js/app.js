angular
    .module(
        'SiliconValleyWebapp',
        [ //'ngRoute', 
        'ngCookies', 'ngMessages', 'ngAria',
            'ngResource',  
            'ngAnimate' ])
    .config(
        [
            //'$routeProvider',
            //'$translateProvider',
            //'$mdThemingProvider',
            //'$locationProvider',
            '$rootScopeProvider',
            function($routeProvider, 
            //$translateProvider, $mdThemingProvider,
                //$locationProvider, 
                $rootScopeProvider) {
              /*$routeProvider.when('/dashboard/:dashboardId?', {
                templateUrl : 'amis-dashboard/views/dashboard.template.html',
                controller : 'amis-dashboard-controller'
              }).when('/indicator/:indicatorId*/ /*:indicatorTopic?/:chartType?',
              /*    {
                    templateUrl : 'views/indicators.html',
                    controller : 'amis-indicators-controller'
                  }).when('/indicators', {
                templateUrl : 'amis-indicatormenu/views/menu.html',
                controller : 'amis-menu-controller'
              }).when('/whatif/:whatifCategoryId', {
                template : '<amis-whatif/>'
              }).otherwise({
                redirectTo : '/indicators'
              });

			*/
            } ]).run([ '$rootScope', function($rootScope) {
      $rootScope.timezone = 'UTC';
    } ]);
