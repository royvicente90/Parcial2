/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author royvi
 */
public class Main {
    
    public static void main(String[] args) {
        
         AsociacionVecinos AsoVen = new AsociacionVecinos();
 //Leer archivo .CSV con los datos dados por el profesor.
 //Ubicación de archivo: ..DirectorioDeProyecto/test/
 
 String SEPARADOR = ",";
    
 BufferedReader bufferLectura = null;
 try {
  // Abrir el .csv en buffer de lectura
  bufferLectura = new BufferedReader(new FileReader("test/datosparcial.csv"));
  
  // Leer una linea del archivo
  String linea = bufferLectura.readLine();
  
  while (linea != null) {
   // Sepapar la linea leída con el separador definido previamente
   String[] campos = linea.split(SEPARADOR); 
   
   AsoVen.agregar(campos[0],campos[1],campos[2],campos[3],campos[4]);
   // Volver a leer otra línea del fichero
   linea = bufferLectura.readLine();
  }
 } 
 catch (IOException e) {
  e.printStackTrace();
 }
 finally {
  // Cierro el buffer de lectura
  if (bufferLectura != null) {
   try {
    bufferLectura.close();
   } 
   catch (IOException e) {
    e.printStackTrace();
   }
  }
 }

        Interfaz interfaz = new Interfaz();
        interfaz.show();
    }

}
