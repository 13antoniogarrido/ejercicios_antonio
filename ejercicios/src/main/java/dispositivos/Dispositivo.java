package dispositivos;

public abstract class Dispositivo {

    private String nombre;
    private boolean estado;

    public Dispositivo (String nombre){
        this.nombre=nombre;
        estado=false;
    }

    public abstract void encender();

    public void apagar (){
        if(estado){
            estado=false;
            System.out.println(nombre + " apagado.");
        }
        else {
            System.out.println(nombre + " ya está apagado.");
        }
    }

    public void mostrarEstado(){
        System.out.println(nombre + "está " + (estado ? "encendido" : "apagado"));
    }

}
