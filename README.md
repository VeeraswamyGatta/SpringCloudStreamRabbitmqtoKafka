# SpringCloudStreamRabbitmqtoKafka

Stream Run Step :

   1) Create kafka topic 

               kafka-topics --zookeeper $ZOOKEEPERS --create --topic springcloud-stream-kafka-mesages --partitions 6 --replication-factor 1

    2) Stream create and deploy :  

	app register --type processor --name dataprocessor --uri docker://veeraswamyg/springcloud-stream-processor-kafka:0.0.1-SNAPSHOT

	app register --type sink --name datasink --uri docker://veeraswamyg/springcloud-stream-sink-kafka:0.0.1-SNAPSHOT

stream create amqtokafkapp --definition "rabbit --host=amq-release-rabbitmq --addresses=amq-release-rabbitmq-ha:5672 --password=scdftest --queues=scdf_amq_test --username=scdftest | dataprocessor  | datasink" --deploy
