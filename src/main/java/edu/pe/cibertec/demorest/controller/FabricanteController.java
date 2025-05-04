package edu.pe.cibertec.demorest.controller;

import edu.pe.cibertec.demorest.model.Fabricante;
import edu.pe.cibertec.demorest.service.IFabricanteService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1")
public class FabricanteController {
    @Autowired
    IFabricanteService fabricanteService;

    @GetMapping("/fabricantes")
    public ResponseEntity<?> listar(){
        List<Fabricante> lst = fabricanteService.listar();
        return  new ResponseEntity<>(lst, HttpStatus.OK);
    }

    @GetMapping(value = "/fabricante/{id}")
    public ResponseEntity<?> obtener(@PathVariable int id){
        Fabricante fabricante = fabricanteService.obtener(id);
        return new ResponseEntity<>(fabricante, fabricante == null? HttpStatus.NOT_FOUND : HttpStatus.OK);
    }

    @PostMapping("/fabricante")
    public ResponseEntity<?> nuevo(@RequestBody Fabricante fabricante){
        Fabricante fabricante_save = fabricanteService.guardar(fabricante);
        return new ResponseEntity<>(fabricante_save, HttpStatus.OK);
    }

    @PutMapping(value = "/fabricante/{id}")
    public ResponseEntity<?> actualizar(@PathVariable int id ,@RequestBody Fabricante fabricante){
        return new ResponseEntity<>(fabricanteService.guardar(fabricante), HttpStatus.OK);
    }

    @DeleteMapping(value = "/fabricante/{id}")
    public ResponseEntity<?> eliminar(@PathVariable int id ){
        fabricanteService.eliminar(id);
        return  new ResponseEntity<>(HttpStatus.OK);
    }


}
