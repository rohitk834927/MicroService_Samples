package com.rohit.ms.os.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ORDER_TB")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue
    private int id;
    private String name;
   // private int qty;
    private double price;
    private String category;
    private String color;
    
    public Order(String name, double price, String category, String color) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.color = color;
        
    }
}
