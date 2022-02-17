package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String name;
    private String code;
    private LocalDateTime orderDate;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="userid",nullable=false)
    private User assignedUser;
    private Category category;

    public Product(int id,String name,String code,User user,Category category){
        this.id=id;
        this.name=name;
        this.code=code;
        this.orderDate=LocalDateTime.now();
        this.assignedUser=user;
        this.category=category;
    }

}
