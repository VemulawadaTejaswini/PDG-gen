Line_2 $$ private <T> List<T> readMessages(final String topicName, final int maxPoll, final MessageExtractor<T> messageExtractor) --> Line_3 $$ final Properties props = new Properties() [CD]
Line_2 $$ private <T> List<T> readMessages(final String topicName, final int maxPoll, final MessageExtractor<T> messageExtractor) --> Line_4 $$ props.put("bootstrap.servers", brokerString) [CD]
Line_3 $$ final Properties props = new Properties() --> Line_4 $$ props.put("bootstrap.servers", brokerString) [FD]
Line_2 $$ private <T> List<T> readMessages(final String topicName, final int maxPoll, final MessageExtractor<T> messageExtractor) --> Line_5 $$ props.put("group.id", "test") [CD]
Line_3 $$ final Properties props = new Properties() --> Line_5 $$ props.put("group.id", "test") [FD]
Line_2 $$ private <T> List<T> readMessages(final String topicName, final int maxPoll, final MessageExtractor<T> messageExtractor) --> Line_6 $$ props.put("enable.auto.commit", "true") [CD]
Line_3 $$ final Properties props = new Properties() --> Line_6 $$ props.put("enable.auto.commit", "true") [FD]
Line_2 $$ private <T> List<T> readMessages(final String topicName, final int maxPoll, final MessageExtractor<T> messageExtractor) --> Line_7 $$ props.put("auto.commit.interval.ms", "1000") [CD]
Line_3 $$ final Properties props = new Properties() --> Line_7 $$ props.put("auto.commit.interval.ms", "1000") [FD]
Line_2 $$ private <T> List<T> readMessages(final String topicName, final int maxPoll, final MessageExtractor<T> messageExtractor) --> Line_8 $$ props.put("session.timeout.ms", "30000") [CD]
Line_3 $$ final Properties props = new Properties() --> Line_8 $$ props.put("session.timeout.ms", "30000") [FD]
Line_2 $$ private <T> List<T> readMessages(final String topicName, final int maxPoll, final MessageExtractor<T> messageExtractor) --> Line_9 $$ props.put("key.deserializer", StringDeserializer.class.getName()) [CD]
Line_3 $$ final Properties props = new Properties() --> Line_9 $$ props.put("key.deserializer", StringDeserializer.class.getName()) [FD]
Line_2 $$ private <T> List<T> readMessages(final String topicName, final int maxPoll, final MessageExtractor<T> messageExtractor) --> Line_10 $$ props.put("value.deserializer", StringDeserializer.class.getName()) [CD]
Line_3 $$ final Properties props = new Properties() --> Line_10 $$ props.put("value.deserializer", StringDeserializer.class.getName()) [FD]
Line_2 $$ private <T> List<T> readMessages(final String topicName, final int maxPoll, final MessageExtractor<T> messageExtractor) --> Line_11 $$ props.put("max.poll.records", String.valueOf(maxPoll)) [FD]
Line_2 $$ private <T> List<T> readMessages(final String topicName, final int maxPoll, final MessageExtractor<T> messageExtractor) --> Line_11 $$ props.put("max.poll.records", String.valueOf(maxPoll)) [CD]
Line_3 $$ final Properties props = new Properties() --> Line_11 $$ props.put("max.poll.records", String.valueOf(maxPoll)) [FD]
Line_12 $$ try (final KafkaConsumer<String, String> kafkaConsumer = new KafkaConsumer(props)) --> Line_13 $$ kafkaConsumer.subscribe(Collections.singletonList(topicName)) [FD]
Line_2 $$ private <T> List<T> readMessages(final String topicName, final int maxPoll, final MessageExtractor<T> messageExtractor) --> Line_13 $$ kafkaConsumer.subscribe(Collections.singletonList(topicName)) [FD]
Line_12 $$ try (final KafkaConsumer<String, String> kafkaConsumer = new KafkaConsumer(props)) --> Line_14 $$ kafkaConsumer.poll(0) [FD]
Line_12 $$ try (final KafkaConsumer<String, String> kafkaConsumer = new KafkaConsumer(props)) --> Line_15 $$ kafkaConsumer.seekToBeginning(Collections.singletonList(new TopicPartition(topicName, 0))) [FD]
Line_12 $$ try (final KafkaConsumer<String, String> kafkaConsumer = new KafkaConsumer(props)) --> Line_16 $$ final ConsumerRecords<String, String> records = kafkaConsumer.poll(1000) [FD]
Line_17 $$ final List<T> messages = new ArrayList() --> Line_19 $$ messages.add(messageExtractor.extract(record)) [FD]
Line_2 $$ private <T> List<T> readMessages(final String topicName, final int maxPoll, final MessageExtractor<T> messageExtractor) --> Line_19 $$ messages.add(messageExtractor.extract(record)) [FD]
Line_18 $$ for (ConsumerRecord<String, String> record : records) --> Line_19 $$ messages.add(messageExtractor.extract(record)) [FD]
