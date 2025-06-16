/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.tienda.service;
import java.util.List;                 
import com.tienda.domain.Categoria; 
/**
 *
 * @author johan
 */
public interface CategoriaService {
    //asigna el método para después implementarlo en el service lmpl (Read)
    public List<Categoria> getCategorias(boolean activos);
}
