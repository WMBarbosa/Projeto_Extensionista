package com.mariowesley.projeto_extensionista.resources;

import com.mariowesley.projeto_extensionista.entities.Business;
import com.mariowesley.projeto_extensionista.services.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/business")
public class BusinessResource {

    @Autowired
    private BusinessService businessService;

    @GetMapping("/owner/{email}")
    public List<Business> getBusinessesByOwnerEmail(@PathVariable String email) {
        return businessService.findBusinessByOwnerEmail(email);
    }

    @GetMapping
    public List<Business> getAllBusinesses() {
        return businessService.findAllBusinesses();
    }
}
