package com.mariowesley.projeto_extensionista.services;

import com.mariowesley.projeto_extensionista.entities.Business;
import com.mariowesley.projeto_extensionista.repositories.BusinessRepository;
import com.mariowesley.projeto_extensionista.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BusinessService {

    @Autowired
    private BusinessRepository businessRepository;

    public Business registerBusiness(Business business) {
        return businessRepository.save(business);
    }

    public List<Business> findBusinessByOwnerEmail(String email) {
        return businessRepository.findByOwnerEmail(email);
    }

    public List<Business> findAllBusinesses() {
        return businessRepository.findAll();
    }
}
