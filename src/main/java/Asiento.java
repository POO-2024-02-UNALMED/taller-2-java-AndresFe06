package test; 
public class Asiento{
    String color; 
    int precio;     
    int registro; 
   static String[] colores={"rojo", "verde", "amarillo", "negro", "blanco"};
    void cambiarColor(String color){
        for (String e: colores){
            if(e.equals(color)){
                this.color=color; 
                break;
            }
        }
    }
}