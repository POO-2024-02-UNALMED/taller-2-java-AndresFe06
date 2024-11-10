package test; 
public class Asiento{
    String color; 
    int precio; 
    int registro; 

    void cambiarColor(String color){
        String[] colores={"rojo", "verde", "amarillo", "negro", "blanco"};
        for (String e: colores){
            if(e.equals(color)){
                this.color=color; 
                break;
            }
        }

    }
}