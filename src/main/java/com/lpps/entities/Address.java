package com.lpps.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {

    @Id
    private String cep;
    private String logradouro;
    private String complement;
    private String neighborhood;
    private String locality;
    private String uf;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;

    public Address(String cep, String logradouro, String complement, String neighborhood, String locality, String uf, String ibge, String gia, String ddd, String siafi) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.complement = complement;
        this.neighborhood = neighborhood;
        this.locality = locality;
        this.uf = uf;
        this.ibge = ibge;
        this.gia = gia;
        this.ddd = ddd;
        this.siafi = siafi;
    }

    public Address() {

    }

    public String getCep() {
        return cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getComplement() {
        return complement;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public String getLocality() {
        return locality;
    }

    public String getUf() {
        return uf;
    }

    public String getIbge() {
        return ibge;
    }

    public String getGia() {
        return gia;
    }

    public String getDdd() {
        return ddd;
    }

    public String getSiafi() {
        return siafi;
    }
}
