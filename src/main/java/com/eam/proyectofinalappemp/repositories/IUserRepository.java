package com.eam.proyectofinalappemp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eam.proyectofinalappemp.models.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {
}
