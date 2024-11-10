package test;

public class Motor {
    int numeroCilindros;
    String tipo; 
    int registro; 
    
    void cambiarRegistro(int registro){
        this.registro=registro;
    }
    void asignarTipo(String tipo){
        String[] tipos={"electrico","gasolia"};
        for (String e: tipos){
            if (e.equals(tipo)){
                this.tipo=tipo;
                break;
            }
        }
    }
}
