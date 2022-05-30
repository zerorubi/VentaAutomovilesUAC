/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capanegocio;

/**
 *
 * @author rubiw
 */
public class Automovil {
    
    public RegistroVenta estaRegistroVenta;
    
    private char codAutomovil;
    private String placaAutomovil;
    private String modeloAutomovil;
    private double costoAutomovil;

    public char getCodAutomovil() {
        return codAutomovil;
    }

    public void setCodAutomovil(char codAutomovil) {
        this.codAutomovil = codAutomovil;
    }

    public String getPlacaAutomovil() {
        return placaAutomovil;
    }

    public void setPlacaAutomovil(String placaAutomovil) {
        this.placaAutomovil = placaAutomovil;
    }

    public String getModeloAutomovil() {
        return modeloAutomovil;
    }

    public void setModeloAutomovil(String modeloAutomovil) {
        this.modeloAutomovil = modeloAutomovil;
    }

    public double getCostoAutomovil() {
        return costoAutomovil;
    }

    public void setCostoAutomovil(double costoAutomovil) {
        this.costoAutomovil = costoAutomovil;
    }

    public void getCostoAutomovil(Double valueOf) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
