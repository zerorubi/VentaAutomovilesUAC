/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capanegocio;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author rubiw
 */
public class RegistroVenta {
    
    public Automovil consignaAutomovil;
    public Vendedor tieneVendedor;
    public Cliente registraCliente;
    public ArrayList<Mantenimiento> tieneMantenimiento = new ArrayList();
    
    private char codRegistro;
    private Date fechaHoraRegistro;
    private double precioRegistro;

    public char getCodRegistro() {
        return codRegistro;
    }

    public void setCodRegistro(char codRegistro) {
        this.codRegistro = codRegistro;
    }

    public Date getFechaHoraRegistro() {
        return fechaHoraRegistro;
    }

    public void setFechaHoraRegistro(Date fechaHoraRegistro) {
        this.fechaHoraRegistro = fechaHoraRegistro;
    }

    public double getPrecioRegistro() {
        return precioRegistro;
    }

    public void setPrecioRegistro(double precioRegistro) {
        this.precioRegistro = precioRegistro;
    }

    public void setFechaHoraRegistro(String fechaHoraRegistro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
