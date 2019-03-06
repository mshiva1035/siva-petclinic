package com.springframework.sivapetclinic.repositories;

import com.springframework.sivapetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long>  {
}