package edu.pe.cibertec.demorest.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombre", length = 80, nullable = false)
    private String name;
    @Column(name = "descripcion", length = 250, nullable = true)
    private String description;
    @Column
    private double price;
    @Column
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "fabricante_id")
    Fabricante fabricante;
}
