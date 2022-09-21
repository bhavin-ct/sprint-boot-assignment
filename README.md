How to deploy [SpringBoot](http://projects.spring.io/spring-boot/) RESTful web service application with [Docker](https://www.docker.com/)

#### Prerequisite

Installed:   
[Docker](https://www.docker.com/)  

#### Steps

##### Clone source code from git
```
$  git clone https://github.com/bhavin-ct/sprint-boot-assignment.git .
```

## Build and Run with docker-compose

Build and start the container by running

```
$ docker-compose up -d 
```

##### Test application with ***curl*** command

```
$ curl localhost:8080/v1/reverseString?str=Test
```

the respone should be:
```
tseT
```

##### Stop Docker Container:
```
docker-compose down
```
