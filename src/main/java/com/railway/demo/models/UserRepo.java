package com.railway.demo.models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    User findByEmail(String email);
    User findByName(String name);
    User findByPassword(String password);
    User findByRole(String role);
    User findByStatus(String status);
}
