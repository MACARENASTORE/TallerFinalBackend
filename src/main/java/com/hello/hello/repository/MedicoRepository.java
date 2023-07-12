package com.hello.hello.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.hello.hello.entity.Medico;

@RepositoryRestResource(collectionResourceRel = "medicos", path="medicos")
@CrossOrigin(origins = "*")


public interface MedicoRepository extends PagingAndSortingRepository<Medico, Long>, CrudRepository<Medico, Long>
{
    //Mappings personalizados
}
