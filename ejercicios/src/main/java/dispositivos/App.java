package dispositivos;

import java.util.ArrayList;

public class App {

    public static void main(String[] args){
        ArrayList<Dispositivo> listaDispositivos = new ArrayList<>();
        listaDispositivos.add(new Televisor("LG"));
        listaDispositivos.add(new Alexa("3.0"));
        listaDispositivos.add(new AireAcondicionado("Samsumg"));

        for (Dispositivo dispositivo : listaDispositivos){
            dispositivo.encender();

            if (dispositivo instanceof ControlRemoto){
                ((ControlRemoto) dispositivo).sincronizar();
            }

            dispositivo.mostrarEstado();
            dispositivo.apagar();
        }


    }

}
