package com.prueba.QUILEIA.Models.Tourist;

import com.prueba.QUILEIA.Models.City.Destino;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;


@Data
@Builder
@AllArgsConstructor@NoArgsConstructor
@Entity
@Table(name = "tourist")
public class Turista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "turista_id")
    private Integer id;
    @Column(name = "NameComplete")
    private String NameCompleto;
    @Column(name = "DateNacimiento")
    private LocalDate FechaNacimiento;
    @Column(name = "Identification")
    private int Identificacion;
    @Column(name = "TypeIdentification")
    private String TipoIdentificacion;
    @Column(name = "FrecuenciaTravel")
    private int FrecuenciaViaje;
    @Column(name = "PriceTravel")
    private double PrecioViajar;
    @Column(name = "UsaTarjetaCredit")
    private boolean UsaTarjetaCredito;

    @OneToOne
    private Destino destino;


}
