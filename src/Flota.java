import java.util.ArrayList;
import java.util.List;

public class Flota {
    private List<MedioDeTransporte> mediosDeTransporte;

    public Flota() {
        mediosDeTransporte = new ArrayList<>();
    }

    // Agregar un medio de transporte
    public void agregarMedioTransporte(MedioDeTransporte medio) {
        mediosDeTransporte.add(medio);
    }

    // Sobrecarga: Agregar una lista de medios de transporte
    public void agregarMediosTransporte(List<MedioDeTransporte> medios) {
        if (medios != null) {
            mediosDeTransporte.addAll(medios);  // Esto debería funcionar siempre que medios sea una lista de objetos de tipo MedioDeTransporte
        }
    }

    public List<MedioDeTransporte> obtenerListaMedios() {
        return mediosDeTransporte;
    }

    public int obtenerCantidadMedios() {
        return mediosDeTransporte.size();
    }
}