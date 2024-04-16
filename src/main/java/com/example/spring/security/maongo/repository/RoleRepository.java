package com.example.spring.security.maongo.repository;

import com.example.spring.security.maongo.model.ERole;
import com.example.spring.security.maongo.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findBynAME(ERole name);
}
