package com.jlco.auth_server.repositories;

import com.jlco.auth_server.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
}
