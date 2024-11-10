package test;

public class Auto {
    String modelo; 
    int precio; 
    Asiento[] asientos;
    String marca;
    Motor motor; 
    int registro; 
    static int cantidadCreados;
    
    int cantidadAsientos (){
        int contador=0;
        for (Asiento i:asientos){
            if(i instanceof Asiento){
                contador++;
            }
        } return contador;
    }


    String verificarIntegridad(){
        for(Asiento i:asientos){
            if(i instanceof Asiento){
                if(i.registro!=motor.registro || i.registro!=registro || registro!=motor.registro){
                  return"Las piezas no son originales";
                }
                } 
            }    
        return"Auto original";
    }


    }

