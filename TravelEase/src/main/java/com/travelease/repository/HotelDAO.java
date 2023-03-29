package com.travelease.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travelease.models.Hotel;

@Repository
public interface HotelDAO extends JpaRepository<Hotel, Integer> {

	void delete(Optional<Hotel> opt);

}
