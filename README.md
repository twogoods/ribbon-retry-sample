sample project for issue : https://github.com/spring-cloud/spring-cloud-netflix/issues/3974  

step：
1. run eureka-server  
2. run two instance provider(only two instance will occur)  
3. run consumer, call http://ip:port/call ,consumer will call provider，result show it always call one instance,no loadbalancer