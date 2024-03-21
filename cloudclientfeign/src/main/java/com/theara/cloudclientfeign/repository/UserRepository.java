package com.theara.cloudclientfeign.repository;

import com.theara.cloudclientfeign.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
