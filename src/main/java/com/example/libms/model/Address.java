package com.example.libms.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "addresses")
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "address_id")
    private Long id;
    @Column(nullable = false)
    private String unitNO;
    @Column(nullable = false)
    private String street;
    private String city;
    private String state;
    private String zip;
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "address")
    private Publisher publisher;

    public Address(String unitNO, String street, String city, String state, String zip) {
        this.unitNO = unitNO;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    public Address() {
    }

}
