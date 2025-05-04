package edu.pe.cibertec.demorest.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "fabricantes")
public class Fabricante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombre", length = 80, nullable = false)
    private String name;
    @OneToMany(mappedBy = "fabricante", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    List<Producto> productos = new ArrayList<>();
}
