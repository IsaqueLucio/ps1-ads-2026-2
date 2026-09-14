package br.edu.fatecfranca.api.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.JdbcTypeCode;

import java.time.LocalDate;
import java.sql.Types;

@Entity
@Table(name = "customers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(name = "ident_document", nullable = false)
    private String identDocument;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column(name = "street_name", nullable = false)
    private String streetName;

    @Column(name = "house_number", nullable = false)
    private String houseNumber;

    @Column
    private String complements;

    @Column(nullable = false)
    private String district;

    @Column(nullable = false)
    private String municipality;

    @Column(nullable = false, length = 2)
    @JdbcTypeCode(Types.CHAR)
    private String state;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;
}