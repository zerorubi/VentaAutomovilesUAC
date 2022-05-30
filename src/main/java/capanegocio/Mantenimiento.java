/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capanegocio;

import java.util.Date;

/**
 *
 * @author rubiw
 */
public class Mantenimiento {
    
    public RegistroVenta correspondeRegistroVenta;
    
    private char codMantenimiento;
    private Date fechaMantenimiento;
    private double precioMantenimiento;
    private String descripcionMantenimiento;

    public char getCodMantenimiento() {
        return codMantenimiento;
    }

    public void setCodMantenimiento(char codMantenimiento) {
        this.codMantenimiento = codMantenimiento;
    }

    public Date getFechaMantenimiento() {
        return fechaMantenimiento;
    }

    public void setFechaMantenimiento(Date fechaMantenimiento) {
        this.fechaMantenimiento = fechaMantenimiento;
    }

    public double getPrecioMantenimiento() {
        return precioMantenimiento;
    }

    public void setPrecioMantenimiento(double presioMantenimiento) {
        this.precioMantenimiento = presioMantenimiento;
    }

    public String getDescripcionMantenimiento() {
        return descripcionMantenimiento;
    }

    public void setDescripcionMantenimiento(String descripcionMantenimiento) {
        this.descripcionMantenimiento = descripcionMantenimiento;
    }

    public void setPrecioMantenimiento(String precioMantenimiento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void getDescripcionMantenimiento(String descripcionMantenimiento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setFechaMantenimiento(String fechaMantenimiento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
