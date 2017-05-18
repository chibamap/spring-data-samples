Spring data samples
---------------------

# Sample Context

This sample database has tables 'person' and 'groups'.
The 'person' belongs to 'group'. It attached over group_id.

The group table has name field. 
These samples provide api to pick up person by group name. 



# Set up


- run mysql(including sample data)

```
docker-compose up -d

```

# Run

- run app
```
gradle bootRun
```


### jpa

```
$ curl http://localhost:8080/jpa/test?groupName=muga
[{"firstName":"John","lastName":"Smith","groupId":3}]

```

### mybatis

```
$ curl http://localhost:8080/mybatis/test?groupName=muga
[{"id":1,"firstName":"John","lastName":"Smith","groupId":3}]
```

### doma

```
curl http://localhost:8080/doma/test?groupName=muga
[{"id":1,"firstName":"John","lastName":"Smith","groupId":3}]
```


