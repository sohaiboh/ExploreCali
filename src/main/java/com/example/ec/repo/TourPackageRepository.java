package com.example.ec.repo;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.ec.domain.TourPackage;

@RepositoryRestResource(collectionResourceRel = "packages", path = "packages")
public interface TourPackageRepository extends CrudRepository<TourPackage, String> {
	TourPackage findByName(@Param("name") String name);

	@Override
	@RestResource(exported = false)
	<S extends TourPackage> S save(S s);



	// Not exposed by Spring Data REST
	@Override 
	@RestResource(exported = false)
	void delete(TourPackage tourPackage);

	// Not exposed by Spring Data REST

	// Not exposed by Spring Data REST
	@Override
	@RestResource(exported = false)
	void deleteAll();

}
