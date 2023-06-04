package com.delOrigen.dao;

import com.delOrigen.entity.Pedido;
import com.delOrigen.repository.PedidoRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class PedidoDaoImpl implements PedidoRepository {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<Pedido> getPedido() {
        String query = "FROM Pedido";
        List <Pedido> resultado = entityManager.createQuery(query).getResultList();
        return resultado;

    }

    @Override    public void eliminar(Long id) {
        Pedido pedido = entityManager.find(Pedido.class, id);
        entityManager.remove(pedido);
    }

    @Override
    public void registrar(Pedido pedido) {
        entityManager.merge(pedido);

    }


}
