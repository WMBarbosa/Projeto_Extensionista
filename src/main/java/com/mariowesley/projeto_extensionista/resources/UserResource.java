package com.mariowesley.projeto_extensionista.resources;

import com.mariowesley.projeto_extensionista.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/users")
public class UserResource {

    @Autowired
    private UserService userService;
}
