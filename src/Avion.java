public class Avion extends MedioDeTransporteMecanico {
    public Avion(String nombreTransporte, String identificador, String anoDeCreacion) {
        super(nombreTransporte, identificador, anoDeCreacion);
    }

    @Override
    public void virar(String direccion) {
        if (estaEncendido()) {
            System.out.println(getNombreTransporte() + " está virando hacia " + direccion + " en el aire.");
        } else {
            System.out.println(getNombreTransporte() + " no puede virar, está apagado.");
        }
    }
}