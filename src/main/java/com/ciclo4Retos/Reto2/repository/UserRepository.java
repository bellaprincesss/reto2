package com.ciclo4Retos.Reto2.repository;

import com.ciclo4Retos.Reto2.repository.crud.UserCrudRepository;
import com.ciclo4Retos.Reto2.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author
 
 * @version 11.0.12
 */
@Repository
public class UserRepository {

    @Autowired
    private UserCrudRepository userCrudRepository;

    public List<User> getAll() {
        return (List<User>) userCrudRepository.findAll();
    }
    public Optional<User> getUser(int id){
        return userCrudRepository.findById(id);
    }

    public User create(User user){
        return userCrudRepository.save(user);
    }

    public void update(User user){
        userCrudRepository.save(user);
    }

    public void delete(User user){
        userCrudRepository.delete(user);
    }

    public boolean emailExists(String email){
        Optional<User> user = userCrudRepository.findByEmail(email);
        return !user.isEmpty();
    }

    public Optional<User> authenticateUser (String email, String password){
        return userCrudRepository.findByEmailAndPassword(email, password);
    }

    //public Optional<User> getUserByNameOrEmail(String name, String email){
    //    return userCrudRepository.findByNameOrEmail(name, email);
    //}

    public List<User> getByMonthBirthtDay(String month){
        return userCrudRepository.findByMonthBirthtDay(month);
    }
}
