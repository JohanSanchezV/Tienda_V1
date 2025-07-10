/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.tienda.service;
import java.util.List;                 
import com.tienda.domain.Producto; 
/**
 *
 * @author johan
 */
public interface ProductoService {
    //asigna el método para después implementarlo en el service lmpl (Read)
    public List<Producto> getProductos(boolean activos);
    
    public Producto getProducto(Producto producto);
    
    public void save(Producto producto);
    
    public void delete(Producto producto);
}
