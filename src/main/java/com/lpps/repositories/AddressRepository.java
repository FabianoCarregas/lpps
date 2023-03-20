package com.lpps.repositories;

import com.lpps.entities.Address;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {

    @Query(value = """
        SELECT a.*
        FROM Address a
        WHERE a.cep = :cep
    """, nativeQuery = true)
    Optional<Address> getAddressByCep(String cep);

}
