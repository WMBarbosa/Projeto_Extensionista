package com.mariowesley.projeto_extensionista.resources;

import com.mariowesley.projeto_extensionista.services.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/business")
public class BusinessResource {

    @Autowired
    private BusinessService businessService;
}
