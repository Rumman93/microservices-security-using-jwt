package com.spring.identityservice.repository;

import com.spring.identityservice.entity.UserCredential;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Author :  Ahmmed Jubayer Rumman
 * Created at : 15 Jan 2024
 */
@Repository
public interface UserCredentialRepository  extends JpaRepository<UserCredential,Integer> {
    Optional<UserCredential> findByName(String username);
}
