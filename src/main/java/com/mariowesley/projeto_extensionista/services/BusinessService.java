package com.mariowesley.projeto_extensionista.services;

import com.mariowesley.projeto_extensionista.repositories.BusinessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessService {

    @Autowired
    private BusinessRepository businessRepository;
}
