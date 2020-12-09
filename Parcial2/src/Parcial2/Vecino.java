/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial2;

/**
 *
 * @author royvi
 */
public class Vecino {
    private String Nombre;
    private String Cedula;
    private String Telefono;
    private String Edificio;
    private String Apartamento;
    private Vecino next;
    
    public void Vecino(){
        
        this.next = null;
        
    }
    
    //Set y Get de apuntadores a siguiente objeto Vecino
    
    public void SetNext(Vecino next){
        
        this.next = next;
        
    }
    
    public Vecino GetNext(){
        
        return next;
    
    }
    
    //SETs y GETs de atributos de clase Vecino
    
    public void SetNombre(String nombre){
        
        this.Nombre = nombre;
        
    }
    
    public String GetNombre(){
        
        return Nombre;
    
    }
    
    public void SetCedula(String cedula){
        
        this.Cedula = cedula;
        
    }
    
    public String GetCedula(){
        
        return Cedula;
    
    }
    
    public void SetTelefono(String telefono){
        
        this.Telefono = telefono;
        
    }
    
    public String GetTelefono(){
        
        return Telefono;
    
    }
    
    public void SetEdificio(String edificio){
        
        this.Edificio = edificio;
        
    }
    
    public String GetEdificio(){
        
        return Edificio;
        
    }
    
    public void SetApartamento(String apartamento){
        
        this.Apartamento = apartamento;
    }
    
    public String GetApartamento(){
        
        return Apartamento;
    
    }
}
    



