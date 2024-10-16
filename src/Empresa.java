public class Empresa {
    // Atributos de la clase Empresa
    private String nombre;
    private String direccion;
    private Flota flota; // Asociación con la clase Flota

    // Constructor de Empresa
    public Empresa(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.flota = new Flota(); // Inicializar la flota al crear la empresa
    }

    // Métodos para obtener la información de la Empresa
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    // Metodo para acceder a la flota
    public Flota getFlota() {
        return flota;
    }
}