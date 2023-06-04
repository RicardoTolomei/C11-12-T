package com.delOrigen.entity;

import com.delOrigen.entity.enumModel.Estado;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @GenericGenerator(name = "native", strategy = "native")
    private Long numeroDeOrden;
    @Column
    private String Cliente;
    @Column
    private Date fecha;

    public Long getNumeroDeOrden() {
        return numeroDeOrden;
    }

    public void setNumeroDeOrden(Long numeroDeOrden) {
        this.numeroDeOrden = numeroDeOrden;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String cliente) {
        Cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    public String getMetodoDeEnvio() {
        return metodoDeEnvio;
    }

    public void setMetodoDeEnvio(String metodoDeEnvio) {
        this.metodoDeEnvio = metodoDeEnvio;
    }

    public String getDireccionDeEnvio() {
        return direccionDeEnvio;
    }

    public void setDireccionDeEnvio(String direccionDeEnvio) {
        this.direccionDeEnvio = direccionDeEnvio;
    }

    public String getContactoDeEnvio() {
        return contactoDeEnvio;
    }

    public void setContactoDeEnvio(String contactoDeEnvio) {
        this.contactoDeEnvio = contactoDeEnvio;
    }

    public String getContactoDeFacturacion() {
        return contactoDeFacturacion;
    }

    public void setContactoDeFacturacion(String contactoDeFacturacion) {
        this.contactoDeFacturacion = contactoDeFacturacion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Column
    private String formaDePago;
    @Column
    private String metodoDeEnvio;
    @Column
    private String direccionDeEnvio;
    @Column
    private String contactoDeEnvio;
    @Column
    private String contactoDeFacturacion;
    @Column
    private Estado estado;


    public void setNumero(Long id) {
    }
}
