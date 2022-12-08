package org.sid.inventory_service;

import org.sid.inventory_service.enteties.Product;
import org.sid.inventory_service.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}
    @Bean
	CommandLineRunner start(ProductRepository productRepository)
	{
		return args -> {
			productRepository.save(new Product(null,"Ordinateur",2220.90,23));
			productRepository.save(new Product(null,"Imprimante",1999.90,23));
			productRepository.save(new Product(null,"SmartPhone",6000.90,23));
			productRepository.findAll().forEach(c->
					System.out.println(c.getName()));



		};
	}

}
