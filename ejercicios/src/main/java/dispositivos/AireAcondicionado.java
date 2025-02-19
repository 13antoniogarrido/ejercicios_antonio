package dispositivos;

public class AireAcondicionado extends Dispositivo implements ControlRemoto{

    public AireAcondicionado(String nombre) {
        super(nombre);
    }

    public void sincronizar() {

    }

    public void encender() {
        if(getEstado()){
            System.out.println("Encendido");
        }else {
            System.out.println("Encendiendo");
        }

    }
}
