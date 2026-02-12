package org.example;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//this handles all the configuration
// replaces the need to manually configure application
@SpringBootApplication
public class FriendApplication {
    public static void main(String[] args){
        SpringApplication.run(FriendApplication.class,args); // this starts the embedded tomcat server
    }

    // the bean is created because RestTemplate isn't auto-configured.
    @Bean
    public RestTemplate restTemplate(){
        //returning basic instance to handle HTTP calls .
        return new RestTemplate();
    }


}
