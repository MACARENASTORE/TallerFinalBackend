package com.hello.hello.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.hello.hello.entity.Paciente;


@RepositoryRestResource(collectionResourceRel = "pacientes", path="pacientes")
@CrossOrigin(origins = "*")

public interface PacienteRepository extends PagingAndSortingRepository<Paciente, Long>, CrudRepository<Paciente, Long>
{
    //Mappings personalizados
}
