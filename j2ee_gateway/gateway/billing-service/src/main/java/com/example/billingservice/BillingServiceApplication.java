package com.example.billingservice;

import com.example.billingservice.entities.Bill;
import com.example.billingservice.feign.CustomerRestClient;
import com.example.billingservice.feign.ProductItemRestClient;
import com.example.billingservice.model.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import com.example.billingservice.repository.BillRepository;
import com.example.billingservice.repository.ProductItemRepository;

import java.util.Date;

//@EnableAutoConfiguration
//@Configuration
@SpringBootApplication
@EnableFeignClients

public class BillingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BillingServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(BillRepository billRepos , ProductItemRepository productItemRepository, CustomerRestClient customerRestClient , ProductItemRestClient productItemRestClient)
    {
            return  args -> {
                Customer customer= customerRestClient.getCustomerById(1L);
                Bill bill = billRepos.save(new Bill(null,new Date(),null,1L,customer.getId(),null));
                System.out.println("----------------------------");
                System.out.println(customer.getId());
                System.out.println(customer.getName());
                System.out.println(customer.getEmail());

            };
    }

}
