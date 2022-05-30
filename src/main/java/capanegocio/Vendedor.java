/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capanegocio;

import java.util.ArrayList;

/**
 *
 * @author rubiw
 */
public class Vendedor {
    
    public ArrayList<RegistroVenta> suscribeRegistroventa= new ArrayList();
    
    private char codVendedor;
    private String NombreVendedor;
    private String celularVendedor;

    public char getCodVendedor() {
        return codVendedor;
    }

    public void setCodVendedor(char codVendedor) {
        this.codVendedor = codVendedor;
    }

    public String getNombreVendedor() {
        return NombreVendedor;
    }

    public void setNombreVendedor(String NombreVendedor) {
        this.NombreVendedor = NombreVendedor;
    }

    public String getCelularVendedor() {
        return celularVendedor;
    }

    public void setCelularVendedor(String celularVendedor) {
        this.celularVendedor = celularVendedor;
    }
    
}
