public class Caballo extends MedioDeTransporteAnimal {
    public Caballo(String nombreTransporte, String identificador, String anoDeCreacion) {
        super(nombreTransporte, identificador, anoDeCreacion);
    }

    @Override
    public void virar(String direccion) {
        if (estaDespierto()) {
            System.out.println(getNombreTransporte() + " está virando hacia " + direccion + " en la tierra.");
        } else {
            System.out.println(getNombreTransporte() + " no puede virar, está descansando.");
        }
    }
}