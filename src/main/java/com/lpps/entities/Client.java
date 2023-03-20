package com.lpps.entities;

import javax.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @ManyToOne
    private Address address;

    public Client(Long id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Client() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void updateAddress(Address address) {
        this.address = address;
    }
}
