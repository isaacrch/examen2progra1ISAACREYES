
package progra1examen2isaacreyeschavarria;

import java.util.ArrayList;

public class clsencuesta {
   
   public static int numeroEncuesta;
    public static String nombre;
    
   
   public static int edad;
    public static String correoElectronico;
   public static boolean tieneCarroPropio;
    
    public int getNumeroEncuesta() {
        return numeroEncuesta;
    }
    
    public void setNumeroEncuesta(int numeroEncuesta) {
        this.numeroEncuesta = numeroEncuesta;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public clsencuesta(int numeroEncuesta, String nombre, int edad, String correoElectronico, boolean tieneCarroPropio) {
        numeroEncuesta = numeroEncuesta;
        nombre = nombre;
        edad = edad;
        correoElectronico = correoElectronico;
        tieneCarroPropio = tieneCarroPropio;
    }
  
    public static int getEdad() {
        return edad;
    }
    
    public static void setEdad(int edad) {
        edad = edad;
    }
    
    public static String getCorreoElectronico() {
        return correoElectronico;
    }
    
    public static  void setCorreoElectronico(String correoElectronico) {
        correoElectronico = correoElectronico;
    }
    
    public static boolean isTieneCarroPropio() {
        return tieneCarroPropio;
    }
    
    public static  void setTieneCarroPropio(boolean tieneCarroPropio) {
        tieneCarroPropio = tieneCarroPropio;
    }
    
}


    
   
