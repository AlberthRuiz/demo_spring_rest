package edu.pe.cibertec.demorest.service;

import edu.pe.cibertec.demorest.model.Fabricante;

import java.util.List;

public interface IFabricanteService {
    List<Fabricante> listar();
    Fabricante obtener(int id);
    Fabricante guardar(Fabricante fabricante);
    void eliminar(int id);
}
