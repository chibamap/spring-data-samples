# Spring data samples


## Set up

- up mysql
```
docker-compose up -d

```

## run app

```
gradle bootRun
```

### run jpa

```
curl localhost:8080/jpa/test?name=muga
```

### run mybatis

```
curl localhost:8080/mybatis/test?name=1
```
