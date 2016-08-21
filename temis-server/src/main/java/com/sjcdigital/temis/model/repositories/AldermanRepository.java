package com.sjcdigital.temis.model.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sjcdigital.temis.model.document.Alderman;

/**
 * @author pedro-hos
 */
public interface AldermanRepository extends MongoRepository<Alderman, String> {
	public Optional<Alderman> findByName(String name);
	public Optional<Alderman> findByNameContainingIgnoreCase(String name);
}
