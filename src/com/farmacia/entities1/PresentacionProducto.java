/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmacia.entities1;

/**
 *
 * @author User
 */
public class PresentacionProducto {
    private Long id_presentacion;
    private String nombrePresentacion;
    private String estado;

    public PresentacionProducto() {
    }

    public PresentacionProducto(Long id_presentacion, String nombrePresentacion) {
        this.id_presentacion = id_presentacion;
        this.nombrePresentacion = nombrePresentacion;
    }

    public PresentacionProducto(Long id_presentacion, String nombrePresentacion, String estado) {
        this.id_presentacion = id_presentacion;
        this.nombrePresentacion = nombrePresentacion;
        this.estado = estado;
    }

    public Long getId_presentaciones() {
        return id_presentacion;
    }

    public void setId_presentaciones(Long id_presentacion) {
        this.id_presentacion = id_presentacion;
    }

    public String getNombrePresentacion() {
        return nombrePresentacion;
    }

    public void setNombrePresentacion(String nombrePresentacion) {
        this.nombrePresentacion = nombrePresentacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }




     
    
}
