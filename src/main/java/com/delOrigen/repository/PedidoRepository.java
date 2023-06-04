package com.delOrigen.repository;

import com.delOrigen.entity.Pedido;

import java.util.List;

public interface PedidoRepository {


    List<Pedido> getPedido();


    void eliminar(Long id);

    void registrar(Pedido pedido);
}
