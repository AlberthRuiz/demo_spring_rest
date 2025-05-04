package edu.pe.cibertec.demorest.service.impl;

import edu.pe.cibertec.demorest.model.Fabricante;
import edu.pe.cibertec.demorest.repository.IFabricanteRepository;
import edu.pe.cibertec.demorest.service.IFabricanteService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FabricanteServiceImpl implements  IFabricanteService{
    @Autowired
    IFabricanteRepository fabricanteRepository;

    @Override
    public List<Fabricante> listar() {
        return (List<Fabricante>) fabricanteRepository.findAll();
    }

    @Override
    public Fabricante obtener(int id) {
        return fabricanteRepository.findById(id).orElse(null);
    }

    @Override
    public Fabricante guardar(Fabricante fabricante) {
        return fabricanteRepository.save(fabricante);
    }

    @Override
    public void eliminar(int id) {
        fabricanteRepository.deleteById(id);
    }
}
