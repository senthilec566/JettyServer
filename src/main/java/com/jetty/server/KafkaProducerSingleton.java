package com.jetty.server;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;

public enum KafkaProducerSingleton {
	_INSTANCE;
	private Producer<String, String> producer = null;
	
	
	public org.apache.kafka.clients.producer.Producer<String,String> getKafkaProducer() {
		if( producer == null ){
		 Properties props = new Properties();
		 props.put("bootstrap.servers", "198.18.134.9:9092,198.18.134.8:9092");
		 props.put("acks", "all");
		 props.put("retries", 0);
		 props.put("batch.size", 16384);
		 props.put("linger.ms", 1);
		 props.put("buffer.memory", 33554432);
		 props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		 props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		 producer = new KafkaProducer<>(props);
		}
		return producer;
	}
}
