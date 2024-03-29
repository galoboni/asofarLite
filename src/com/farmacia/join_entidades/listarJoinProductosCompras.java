/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmacia.join_entidades;

import java.sql.Date;

/**
 *
 * @author User
 */
public class listarJoinProductosCompras {
     private Long id_productos;
    private String nombreProductos;
    private String descripcion;
    private Date fecha_registro;
    private Double peso;
    private Long id_tipo;
    private String nombreTipo;
    private Long id_medida;
    private String nombreMedida;
    private Long id_presentacion;
    private String nombrePresentacion;
    private Long id_categoria;
    private String nombreCategoria;
    private Long id_marca;
    private String nombreMarca;
    private Long id_usuario;
    private String iva;
    private Long cantidad_minima;
    private Double precioCompra;
    private Long cantidadStock;
    private Long idStock;
    private String receta;
    private Long unidades;
    private String codigo_barras;
    
    public listarJoinProductosCompras() {
    }

    public listarJoinProductosCompras(Long id_categoria, String nombreCategoria,Long id_productos, String nombreProductos, String descripcion, Date fecha_registro, Double peso, Long id_tipo, String nombreTipo, Long id_medida, String nombreMedida, Long id_presentacion, String nombrePresentacion, Long id_marca, String nombreMarca, Long id_usuario, String iva, Long cantidad_minima, Double precioCompra, Long cantidadStock, Long idStock, String receta, Long unidades, String codigo_barras) {
        this.id_categoria = id_categoria;
        this.nombreCategoria = nombreCategoria;
        this.id_productos = id_productos;
        this.nombreProductos = nombreProductos;
        this.descripcion = descripcion;
        this.fecha_registro = fecha_registro;
        this.peso = peso;
        this.id_tipo = id_tipo;
        this.nombreTipo = nombreTipo;
        this.id_medida = id_medida;
        this.nombreMedida = nombreMedida;
        this.id_presentacion = id_presentacion;
        this.nombrePresentacion = nombrePresentacion;
        this.id_marca = id_marca;
        this.nombreMarca = nombreMarca;
        this.id_usuario = id_usuario;
        this.iva = iva;
        this.cantidad_minima = cantidad_minima;
        this.precioCompra = precioCompra;
        this.cantidadStock = cantidadStock;
        this.idStock = idStock;
        this.receta = receta;
        this.unidades = unidades;
        this.codigo_barras = codigo_barras;
    }

    public Long getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(Long id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }
    
    

    public Long getId_productos() {
        return id_productos;
    }

    public void setId_productos(Long id_productos) {
        this.id_productos = id_productos;
    }

    public String getNombreProductos() {
        return nombreProductos;
    }

    public void setNombreProductos(String nombreProductos) {
        this.nombreProductos = nombreProductos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Long getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(Long id_tipo) {
        this.id_tipo = id_tipo;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    public Long getId_medida() {
        return id_medida;
    }

    public void setId_medida(Long id_medida) {
        this.id_medida = id_medida;
    }

    public String getNombreMedida() {
        return nombreMedida;
    }

    public void setNombreMedida(String nombreMedida) {
        this.nombreMedida = nombreMedida;
    }

    public Long getId_Presentacion() {
        return id_presentacion;
    }

    public void setId_Presentacion(Long id_presentacion) {
        this.id_presentacion = id_presentacion;
    }

    public String getNombrePresentacion() {
        return nombrePresentacion;
    }

    public void setNombrePresentacion(String nombrePresentacion) {
        this.nombrePresentacion = nombrePresentacion;
    }

    public Long getId_marca() {
        return id_marca;
    }

    public void setId_marca(Long id_marca) {
        this.id_marca = id_marca;
    }

    public String getNombreMarca() {
        return nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getIva() {
        return iva;
    }

    public void setIva(String iva) {
        this.iva = iva;
    }

    public Long getCantidad_minima() {
        return cantidad_minima;
    }

    public void setCantidad_minima(Long cantidad_minima) {
        this.cantidad_minima = cantidad_minima;
    }

    public Double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(Double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Long getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(Long cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public Long getIdStock() {
        return idStock;
    }

    public void setIdStock(Long idStock) {
        this.idStock = idStock;
    }

    public String getReceta() {
        return receta;
    }

    public void setReceta(String receta) {
        this.receta = receta;
    }

    public Long getUnidades() {
        return unidades;
    }

    public void setUnidades(Long unidades) {
        this.unidades = unidades;
    }

    public String getCodigo_barras() {
        return codigo_barras;
    }

    public void setCodigo_barras(String codigo_barras) {
        this.codigo_barras = codigo_barras;
    }

    
}
