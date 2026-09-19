package br.edu.fatecfranca.api.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.math.BigDecimal;

@Entity
@Table(name = "cars")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String brand;

    @Column(nullable = false)
    private String model;

    @Column(nullable = false) 
    private String color;

    @Column(name = "year_manufacture", nullable = false)
    private Integer yearManufacture;

    @Column(nullable = false)
    private Boolean imported;

    @Column(nullable = false)
    private String plates;

    @Column(name = "selling_date")
    private LocalDateTime sellingDate;
    
    @Column(name = "selling_price", precision = 65, scale = 30)
    private BigDecimal sellingPrice;

    @ManyToOne 
    @JoinColumn(name = "customer_id")
    private Customer customer;
    
}