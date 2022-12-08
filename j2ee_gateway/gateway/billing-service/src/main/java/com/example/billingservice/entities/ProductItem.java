package com.example.billingservice.entities;

import jakarta.persistence.*;
import com.example.billingservice.model.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductItem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private double quantity;
    private double price;
    private long productID;
    @ManyToOne
    private Bill bill;
    @Transient
    private Product product;
}
