package com.delOrigen.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
public class Carrito {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @GenericGenerator(name = "native", strategy = "native")
    private long id_carrito;
@Column
    private List<Pedido> listaPedidos;
@Column
private double costoTotal;


    public void agregarPedido(Pedido p1){
        
        listaPedidos.add(p1);
        
    }
    
    public List<Pedido> mostrarCarrito(){
        return listaPedidos;
    }
    
    public void eliminarPedido(Pedido pedido){
        for (int i=0;i<listaPedidos.size();i++){
            if(listaPedidos.get(i).getNumeroDeOrden().equals(pedido)){
                listaPedidos.remove(pedido);
            }

            
        }
        public void calculocostoCarrito(){


            for (int i=0;i<listaPedidos.size();i++){
                double Costo = listaPedidos.get(i).getCosto();
                costoTotal=(costoTotal+Costo);

            }

        }





}

    public long getId_carrito() {
        return id_carrito;
    }

    public void setId_carrito(long id_carrito) {
        this.id_carrito = id_carrito;
    }

    public List<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(List<Pedido> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }
