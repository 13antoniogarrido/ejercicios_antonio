package dispositivos;

public class Televisor extends Dispositivo implements ControlRemoto{


    public Televisor(String nombre) {
        super(nombre);
    }

    public void sincronizar() {

    }

    public void encender() {
        if(getEstado()){
            System.out.println("El televisor ya está encendido");
        }else {
            System.out.println("Encenciendo el televisor");
        }
        System.out.println("Encendido televisor...");
    }
}
