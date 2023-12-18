package com.herman87.cofeemanagementapi.dao;

import com.herman87.cofeemanagementapi.POJO.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
