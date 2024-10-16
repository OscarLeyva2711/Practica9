public class MedioDeTransporteMecanico extends MedioDeTransporte {
    private boolean encendido;

    public MedioDeTransporteMecanico(String nombreTransporte, String identificador, String anoDeCreacion) {
        super(nombreTransporte, identificador, anoDeCreacion);
        this.encendido = false; // Inicia apagado
    }

    // Métodos de encender y apagar
    public void encender() {
        this.encendido = true;
        System.out.println(getNombreTransporte() + " ha sido encendido.");
    }

    public void apagar() {
        this.encendido = false;
        System.out.println(getNombreTransporte() + " ha sido apagado.");
    }

    public boolean estaEncendido() {
        return encendido;
    }

    // Sobrescribir métodos para avanzar, retroceder y virar
    @Override
    public void avanzar() {
        if (estaEncendido()) {
            System.out.println(getNombreTransporte() + " está avanzando.");
        } else {
            System.out.println(getNombreTransporte() + " no puede avanzar, está apagado.");
        }
    }

    @Override
    public void retroceder() {
        if (estaEncendido()) {
            System.out.println(getNombreTransporte() + " está retrocediendo.");
        } else {
            System.out.println(getNombreTransporte() + " no puede retroceder, está apagado.");
        }
    }

    @Override
    public void virar(String direccion) {
        if (estaEncendido()) {
            System.out.println(getNombreTransporte() + " está virando hacia " + direccion + ".");
        } else {
            System.out.println(getNombreTransporte() + " no puede virar, está apagado.");
        }
    }
}