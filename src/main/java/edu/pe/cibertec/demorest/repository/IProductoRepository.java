package edu.pe.cibertec.demorest.repository;

import edu.pe.cibertec.demorest.model.Producto;
import org.springframework.data.repository.CrudRepository;

public interface IProductoRepository extends CrudRepository<Producto,Integer> {
}
