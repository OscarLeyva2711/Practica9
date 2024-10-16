public class Autobus extends MedioDeTransporteMecanico {
    public Autobus(String nombreTransporte, String identificador, String anoDeCreacion) {
        super(nombreTransporte, identificador, anoDeCreacion);
    }

    @Override
    public void virar(String direccion) {
        if (estaEncendido()) {
            System.out.println(getNombreTransporte() + " está virando hacia " + direccion + " en la carretera.");
        } else {
            System.out.println(getNombreTransporte() + " no puede virar, está apagado.");
        }
    }
}