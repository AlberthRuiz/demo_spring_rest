package edu.pe.cibertec.demorest.controller;

import edu.pe.cibertec.demorest.model.Producto;
import edu.pe.cibertec.demorest.service.IProductoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping ("api/v1")
public class ProductoController {
    @Autowired
    IProductoService productoService;

    @GetMapping("/productos")
    public ResponseEntity<?> listar() {
        List<Producto> list = productoService.listar();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping(value = "/producto/{id}")
    public ResponseEntity<?> obtener(int id) {
        Producto p = productoService.obtener(id);
        return new ResponseEntity<>(p, p == null ? HttpStatus.NOT_FOUND : HttpStatus.OK);
    }

    @PostMapping("/producto")
    public ResponseEntity<?> nuevo(@RequestBody Producto producto) {
        return new ResponseEntity<>(productoService.guardar(producto), HttpStatus.OK);
    }

    @PutMapping(value = "/producto/{id}")
    public ResponseEntity<?> actualizar( @PathVariable int id, @RequestBody Producto producto){
        return  new ResponseEntity<>(productoService.guardar(producto), HttpStatus.OK );
    }

    @DeleteMapping(value = "/producto/{id}")
    public ResponseEntity<?> eliminar(int id) {
        productoService.elminiar(id);
        return  new ResponseEntity<>(HttpStatus.OK);
    }

}


