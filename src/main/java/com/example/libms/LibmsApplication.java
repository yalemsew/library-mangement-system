package com.example.libms;

import com.example.libms.dto.request.AddressRequestDto;
import com.example.libms.dto.request.PublisherRequestDto;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LibmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibmsApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(){
        return args -> {
            PublisherRequestDto publisherRequestDto = new PublisherRequestDto(
                    "Publisher1", new AddressRequestDto(
                    "Street1", "City1", "State1", "Country1", "ZipCode1"
            )
            );
        };
    }

}
