package com.delOrigen.controller;

import com.delOrigen.entity.Carrito;
import com.delOrigen.entity.Pedido;
import com.delOrigen.repository.CarritoRepository;
import com.delOrigen.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public class CarritoController {


    @Autowired
    private CarritoRepository carritoRepository;

    @RequestMapping(value = "api/carrito/{id}", method = RequestMethod.GET)

    public Carrito GetCarrito(@PathVariable Long id){
        Carrito carrito = new Carrito();

       

        return carrito;

    }
    @RequestMapping (value = "api/carrito1", method = RequestMethod.GET) 

    public List<Carrito> GetPedido(){
        return carritoRepository.getCarrito();

    }
   

  
    

}
