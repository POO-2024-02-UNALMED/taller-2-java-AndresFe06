package test;

public class Motor {
    int numeroCilindros;
    String tipo; 
    int registro; 
    static String[] tipos={"electrico","gasolia"};
    
    void cambiarRegistro(int registro){
        this.registro=registro;
    }
    void asignarTipo(String tipo){
        for (String e: tipos){
            if (e.equals(tipo)){
                this.tipo=tipo;
                break;
            }
        }
    }
}
