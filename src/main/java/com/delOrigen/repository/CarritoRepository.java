package com.delOrigen.repository;

import com.delOrigen.entity.Carrito;
import com.delOrigen.entity.Pedido;

import java.util.List;

public interface CarritoRepository {


    List<Carrito> getCarrito();


    void eliminar(Long id);

    void registrar(Carrito carrito);

}
