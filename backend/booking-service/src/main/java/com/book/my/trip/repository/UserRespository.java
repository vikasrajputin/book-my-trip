package com.book.my.trip.repository;


import com.book.my.trip.entity.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRespository extends JpaRepository<UserData, String> {






}
