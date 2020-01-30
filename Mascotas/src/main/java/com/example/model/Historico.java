
package com.example.model;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="historico")
public class Historico {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column
	private String dni;
        @Column
	private String usuario;
        @Column
	private String tipo;
        @Column
	private int precio ;
        @Column
	private String fecha_venta;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getFecha() {
        return fecha_venta;
    }

    public void setFecha(String fecha) {
        this.fecha_venta = fecha;
    }

   

  
	

}
