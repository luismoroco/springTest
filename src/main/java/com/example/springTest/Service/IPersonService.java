package com.example.springTest.Service;

import com.example.springTest.Entity.Persona;

import java.util.List;

public interface IPersonService {
    public List<Persona> getIfContainArgs(int argForFiler);
    public Persona createNew(Persona newPerson);
    public Persona setNewParams(Persona newParams);
    public Persona searchIfExist(Long id);
    public boolean destroy(Long id);
}
