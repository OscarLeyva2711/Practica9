import java.util.ArrayList;

public class MedioDeTransporte {
    // Atributos
    protected final String nombreTransporte; // Inmutable
    protected final String identificador;    // Inmutable
    protected final String anoDeCreacion;    // Inmutable
    protected ArrayList<String> historialDeMantenimiento; // Mutable

    // Constructor
    public MedioDeTransporte(String nombreTransporte, String identificador, String anoDeCreacion) {
        this.nombreTransporte = nombreTransporte;
        this.identificador = identificador;
        this.anoDeCreacion = anoDeCreacion;
        this.historialDeMantenimiento = new ArrayList<>();
    }

    // Métodos getter para los atributos inmutables
    public String getNombreTransporte() {
        return nombreTransporte;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getAnoDeCreacion() {
        return anoDeCreacion;
    }

    // Métodos para el historial de mantenimiento (mutable)
    public ArrayList<String> getHistorialDeMantenimiento() {
        return historialDeMantenimiento;
    }

    public void agregarMantenimiento(String mantenimiento) {
        historialDeMantenimiento.add(mantenimiento);
    }

    public void mostrarHistorialMantenimiento() {
        System.out.println("Historial de Mantenimiento:");
        for (String mantenimiento : historialDeMantenimiento) {
            System.out.println(mantenimiento);
        }
    }

    // Métodos para acciones del medio de transporte
    public void avanzar() {
        System.out.println(nombreTransporte + " está avanzando.");
    }

    public void retroceder() {
        System.out.println(nombreTransporte + " está retrocediendo.");
    }

    public void virar(String direccion) {
        System.out.println(nombreTransporte + " está virando hacia " + direccion + ".");
    }

    public void virar() {
    }
}


