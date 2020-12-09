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
public class AsociacionVecinos {
    
    
    private Vecino primero;
    
    public void AsociacionVecinos(){
        
        primero = null;
        
    }
    
    public boolean esVacia(){
        
        return primero == null;
    }
    
    public void agregar(String cedula, String nombre, String telefono, String edificio, String apartamento){
        //Agregar a lista de Vecinos
        
        Vecino nuevo = new Vecino();
        nuevo.SetNombre(nombre);
        nuevo.SetCedula(cedula);
        nuevo.SetTelefono(telefono);
        nuevo.SetEdificio(edificio);
        nuevo.SetApartamento(apartamento);
        if (esVacia()) {
            primero = nuevo;
        } else {
            Vecino aux = primero;
            while (aux.GetNext() != null){
                
                aux = aux.GetNext();
            }
            aux.SetNext(nuevo);
        }
        
    }
    
    
    
    
    
}
