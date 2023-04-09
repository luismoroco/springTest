package com.example.springTest.Repository;

import com.example.springTest.Entity.Persona;
import org.springframework.data.repository.CrudRepository;

public interface IPersonRepository extends CrudRepository<Persona, Long> {
    /**/
}
