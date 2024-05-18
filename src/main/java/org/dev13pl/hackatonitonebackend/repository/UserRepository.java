package org.dev13pl.hackatonitonebackend.repository;

import org.dev13pl.hackatonitonebackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    @Override
    Optional<User> findById(String userId);
}
