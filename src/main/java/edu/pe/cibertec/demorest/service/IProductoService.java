package edu.pe.cibertec.demorest.service;

import edu.pe.cibertec.demorest.model.Producto;

import java.util.List;

public interface IProductoService  {
    List<Producto> listar();
    Producto obtener(int id);
    Producto guardar(Producto producto);
    void elminiar (int id);
}
