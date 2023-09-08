/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.brocoli.negocio;

/**
 * Contiene métodos para trabajar con tipos de dato String.
 * @author Jose Manuel Leyva Munguia
 */
public class Operacion {
    
    /**
    * Separa una cadena de texto a partir de la expresión "guión medio".
    * @param valor Cadena de texto que será separada a partir de la expresión dada.
    * @return Array de String donde en cada posición representa una división de la cadena de texto.
    */
    
    public String[] separar(String valor){
        // Hola, esto es un cambio xd
        String[] elementos = valor.split("-");
        
        return elementos;
        
    }
    
}
