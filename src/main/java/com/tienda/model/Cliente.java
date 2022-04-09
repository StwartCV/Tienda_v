package com.tienda.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity //entidad es una tabla de base de datos
@Table(name="cliente") /*/utilizada para mapear la tabla de los registros clientes/*/
public class Cliente implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //La genreracion de valores sea igual a la que genere la base de datos
    private Long idCliente;
    
    private String nombre;
    private String apellidos;
    private String correo;
    private String telefono;
    
    @JoinColumn(name="id_credito", referencedColumnName = "id_credito")
    @ManyToOne
    public Credito credito;

    public Cliente() {
    }

    public Cliente(String nombre, String apellidos, String correo, String telefono, Credito credito) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
        this.credito = credito;
    }
   
}
