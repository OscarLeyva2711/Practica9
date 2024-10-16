public class MedioDeTransporteAnimal extends MedioDeTransporte {
    private boolean despierto;

    public MedioDeTransporteAnimal(String nombreTransporte, String identificador, String anoDeCreacion) {
        super(nombreTransporte, identificador, anoDeCreacion);
        this.despierto = false; // Inicia descansando
    }

    // Métodos para preparar y descansar
    public void preparar() {
        this.despierto = true;
        System.out.println(getNombreTransporte() + " está listo para ser utilizado.");
    }

    public void descansar() {
        this.despierto = false;
        System.out.println(getNombreTransporte() + " está descansando.");
    }

    public boolean estaDespierto() {
        return despierto;
    }

    // Sobrescribir métodos para avanzar, retroceder y virar
    @Override
    public void avanzar() {
        if (estaDespierto()) {
            System.out.println(getNombreTransporte() + " está avanzando.");
        } else {
            System.out.println(getNombreTransporte() + " no puede avanzar, está descansando.");
        }
    }

    @Override
    public void retroceder() {
        if (estaDespierto()) {
            System.out.println(getNombreTransporte() + " está retrocediendo.");
        } else {
            System.out.println(getNombreTransporte() + " no puede retroceder, está descansando.");
        }
    }

    @Override
    public void virar(String direccion) {
        if (estaDespierto()) {
            System.out.println(getNombreTransporte() + " está virando hacia " + direccion + ".");
        } else {
            System.out.println(getNombreTransporte() + " no puede virar, está descansando.");
        }
    }
}