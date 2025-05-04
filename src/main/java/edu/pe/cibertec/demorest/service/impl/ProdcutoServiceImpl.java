package edu.pe.cibertec.demorest.service.impl;

import edu.pe.cibertec.demorest.model.Producto;
import edu.pe.cibertec.demorest.repository.IProductoRepository;
import edu.pe.cibertec.demorest.service.IProductoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProdcutoServiceImpl implements IProductoService {
    @Autowired
    IProductoRepository productoRepository;
    @Override
    public List<Producto> listar() {
        return (List<Producto>) productoRepository.findAll();
    }

    @Override
    public Producto obtener(int id) {
        return productoRepository.findById(id).orElse(null);
    }

    @Override
    public Producto guardar(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public void elminiar(int id) {
        productoRepository.deleteById(id);
    }
}
