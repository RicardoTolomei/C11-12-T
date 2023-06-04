package com.delOrigen.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Carrito {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @GenericGenerator(name = "native", strategy = "native")
    private long id_carrito;

    private List<Pedido> listaPedidos;


    public void agregarPedido(Pedido p1){
        
        listaPedidos.add(p1);
        
    }
    
    public List<Pedido> mostrarCarrito(){
        return listaPedidos;
    }



}
