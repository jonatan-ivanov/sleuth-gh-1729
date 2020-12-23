# Demo App for spring-cloud-sleuth/issues/1729

https://github.com/spring-cloud/spring-cloud-sleuth/issues/1729

This is what happens if you throw an exception out of a `@Scheduled` method:

```
2020-12-23 11:33:46.185  INFO [demo-app,81f7d1d3b5ec9714,81f7d1d3b5ec9714] 34522 --- [   scheduling-1] c.e.s.SleuthGh1729Application            : hey!
2020-12-23 11:35:48.237 ERROR [demo-app,,] 34522 --- [   scheduling-1] o.s.s.s.TaskUtils$LoggingErrorHandler    : Unexpected error occurred in scheduled task
```

As you can see, the `ERROR` event does not have tracing information although it should.
