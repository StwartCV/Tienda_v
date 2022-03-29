package com.tienda.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity //entidad es una tabla de base de datos
@Table(name = "credito")
/*/utilizada para mapear la tabla de los registros creditos/*/
public class Credito implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //La genreracion de valores sea igual a la que genere la base de datos
    @Column(name = "id_credito")
    private Long idCredito;
    private Double limite;

    public Credito() {
    }

    public Credito(Double limite) {
        this.limite = limite;
    }

}
