package client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigClient {

    public static void main(String...args){
        SpringApplication.run(ConfigClient.class, args);
    }

    @Value("${user.role}")
    private String role;

    @GetMapping("/configtest/{username}")
    public String test(@PathVariable("username") String username){
        return "are you " + username + " ?, you are now " + role;
    }

}
