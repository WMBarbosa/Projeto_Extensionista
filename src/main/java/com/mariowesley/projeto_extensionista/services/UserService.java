package com.mariowesley.projeto_extensionista.services;

import com.mariowesley.projeto_extensionista.entities.User;
import com.mariowesley.projeto_extensionista.repositories.UserRepository;
import com.mariowesley.projeto_extensionista.services.exceptions.DataBaseException;
import com.mariowesley.projeto_extensionista.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id){
        Optional<User> user = userRepository.findById(id);
        return user.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert(User user){
        return userRepository.save(user);
    }

    public void delete(Long id){
        try{
            userRepository.deleteById(id);
        }catch (EmptyResultDataAccessException e){
            throw new ResourceNotFoundException(id);
        }catch (DataIntegrityViolationException e){
            throw new DataBaseException(e.getMessage());
        }
    }

    public User findByEmail(String email){
        Optional<User> user = userRepository.findByEmail(email);
        return user.orElseThrow(() -> new ResourceNotFoundException(email));
    }

    public User update(Long id, User user){
        try {
            User entity = userRepository.getReferenceById(id);
            updateData(entity, user);
            return userRepository.save(entity);
        }catch (EntityNotFoundException e){
            throw new ResourceNotFoundException(id);
        }
    }

    public void updateData(User newUser, User user){
        newUser.setName(user.getName());
        newUser.setEmail(user.getEmail());
        newUser.setPassword(user.getPassword());
    }
}
