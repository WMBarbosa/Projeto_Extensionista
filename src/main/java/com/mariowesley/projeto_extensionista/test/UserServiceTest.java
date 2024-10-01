package com.mariowesley.projeto_extensionista.test;

import com.mariowesley.projeto_extensionista.entities.User;
import com.mariowesley.projeto_extensionista.services.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@Configuration
@Profile("test")
public class UserServiceTest implements CommandLineRunner {

    @Autowired
    private UserService userService;

    @Test
    public void testRegisterUser() {
        User user = new User();
        user.setName("John Doe");
        user.setEmail("john.doe@example.com");
        user.setPassword("password123");

        User savedUser = userService.insert(user);

        assertNotNull(savedUser);
        assertEquals("john.doe@example.com", savedUser.getEmail());
    }


    @Override
    public void run(String... args) throws Exception {
        testRegisterUser();
    }
}
