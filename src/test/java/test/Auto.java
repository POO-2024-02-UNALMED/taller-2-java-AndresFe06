package test;

public class Auto {
    String modelo; 
    int precio; 
    Asiento[] asientos;
    String marca;
    Motor motor; 
    int registro; 
    static String cantidadCreados;
    
    int cantidadAsientos (){
        return asientos.length;

    }
    void verificarIntegridad(Asiento asiento, Motor motor){
        if (this.registro==asiento.registro && asiento.registro==motor.registro){
            System.out.println("Auto original");
        }else{
            System.out.println("“Las piezas no son originales");
        }
    }

    
}
