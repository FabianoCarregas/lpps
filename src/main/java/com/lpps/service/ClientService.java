package com.lpps.service;

import com.lpps.entities.Client;

public interface ClientService {

    Iterable<Client> findAll();

    Client findById(Long id);

    void insert(Client client);

    void update(Long id, Client client);

    void delete(Long id);
}
