package com.dh.ts.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dh.ts.domain.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long>{

	public Page<Hotel> findByNameLikeIgnoreCase(String name, Pageable pageable );
}
