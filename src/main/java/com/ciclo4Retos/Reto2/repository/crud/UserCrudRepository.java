package com.ciclo4Retos.Reto2.repository.crud;

import com.ciclo4Retos.Reto2.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

/**
 *
 * @author Nadia
 * @version 11.0.12
 */
public interface UserCrudRepository extends MongoRepository<User, Integer> {
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email, String password);
    Optional<User> findByNameOrEmail(String name, String email);
}


