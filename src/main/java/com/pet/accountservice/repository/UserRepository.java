package com.pet.accountservice.repository;

import com.pet.accountservice.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
