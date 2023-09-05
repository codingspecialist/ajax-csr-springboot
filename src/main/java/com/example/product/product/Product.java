package com.example.product.product;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Table(name = "product_tb")
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer price;
    private Integer stock;
    private Integer gubun; // 1 과일, 2 생필품

    @Builder
    public Product(Integer id, String name, Integer price, Integer stock, Integer gubun) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.gubun = gubun;
    }
}
