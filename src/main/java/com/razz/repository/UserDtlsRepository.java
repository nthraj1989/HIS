package com.razz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.razz.entity.UserDtlsEntity;

@Repository
public interface UserDtlsRepository extends JpaRepository<UserDtlsEntity, Long> {

}
