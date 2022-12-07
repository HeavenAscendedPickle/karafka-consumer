package telran.java2022;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class KarafkaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KarafkaConsumerApplication.class, args);
	}
	

	@Autowired
	@KafkaListener(topics = "4aa0cils-default", groupId = "default")
	    public void processMessage(String message) {
	        System.out.println(message);
	    }

}
