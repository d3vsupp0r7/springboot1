# Starting Apache Kafka on windows

cd C:\dev\apacheTools\kafka_2.12-2.2.0\bin\windows

1) zookeper
zookeeper-server-start.bat ..\..\config\zookeeper.properties

2) kafka-server
kafka-server-start.bat ..\..\config\server.properties


## Apache Kafka Tools

### kafka-console-consumer.bat

##### Read all messages on topic

C:\dev\apacheTools\kafka_2.12-2.2.0\bin\windows>kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic sample-topic-read --from-beginning

##### Read only x message from a topic from beginning
kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic sample-topic-read --from-beginning --max-messages 3

## REST API
### Publish a string message
http://localhost:8080/kafka/publish/echo?message=simpleMessage

# Windows commands
## List an open task on port an kill it
netstat -ano | findstr :8080

taskkill /PID 26236 /F
