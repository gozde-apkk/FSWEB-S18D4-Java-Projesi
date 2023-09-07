package com.workintech.jpamany.service;

import com.workintech.jpamany.entity.Address;

import java.util.List;
import java.util.Optional;

public interface AddressService {

    List<Address> get();
    Address save(Address address);
    Address getById(int id);
    void delete(Address address);
}
