package com.buyzon.userservice.controller;

import com.buyzon.userservice.model.Address;
import com.buyzon.userservice.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressRepository addressRepository;

    @GetMapping("/")
    public List<Address> getAddresses() {
        return addressRepository.findAll();
    }

}
