/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos01;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
       //String miCiudad = obtenerCiudadMayuscula("Loja");
       // System.out.printf("%s\n", miCiudad);
       
       obtenerMultiplicacion(7, 50);
       
       String miMensaje = obtenerMultiplicacionDos(7,50);
        System.out.printf("%s\n", miMensaje);
    }
    
    public static void obtenerMultiplicacion(int tabla, int limite){
        int mult = 1;
        int resp;
        while (mult <= limite) {
            resp = tabla * mult;
            System.out.printf("%d x %d = %d\n", tabla, mult, resp);
            mult++;
        }
        
    }
    
    public static String obtenerMultiplicacionDos(int tabla, int limite) {
        int mult = 1;
        int resp;
        String cadena = "";
        while (mult <= limite) {
            resp = tabla * mult;
            cadena = String.format("%s%d x %d = %d\n", 
                    cadena,tabla, mult, resp);
            mult++;
        }
        return cadena;
    }
    
    /*
    En la primera tabla estamos usando un procedimiento y en la segunda estamos
    usando una funcion para obtener el mismo resultado.
    */
    
    
    /*
    public static String obtenerCiudadMayuscula(String m){
        String m2 = m.toUpperCase();
        return m2;
    }
    
    
    
    public static String obtenerNombre(){
        return "Luis";
    }
    
    */
}
