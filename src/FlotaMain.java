import java.util.ArrayList;
import java.util.List;

public class FlotaMain {
    public static void main(String[] args) {
        // Crear una instancia de Flota
        Flota flota = new Flota();

        // Crear medios de transporte mecánicos y animales
        MedioDeTransporteMecanico autobus = new MedioDeTransporteMecanico("Autobús", "1234", "2010");
        MedioDeTransporteMecanico avion = new MedioDeTransporteMecanico("Avión", "5678", "2015");
        MedioDeTransporteAnimal caballo = new MedioDeTransporteAnimal("Caballo", "AB12", "2005");


        // Agregar mantenimientos individuales
        autobus.agregarMantenimiento("Cambio de aceite - 2023");
        avion.agregarMantenimiento("Revisión general - 2022");
        caballo.agregarMantenimiento("Visita al veterinario - 2023");




        // Probar los métodos para avanzar, retroceder y virar
        autobus.avanzar();
        avion.retroceder();
        caballo.virar();


        // Probar el encendido/apagado en medios mecánicos
        autobus.encender();
        avion.apagar();

        // Probar preparar y descansar en medios de transporte animal
        caballo.preparar();


        // Agregar un medio de transporte individualmente a la flota
        flota.agregarMedioTransporte(autobus);

        // Crear una lista de medios de transporte y agregarla a la flota
        List<MedioDeTransporte> listaMedios = new ArrayList<>();
        listaMedios.add(avion);
        listaMedios.add(caballo);


        flota.agregarMediosTransporte(listaMedios);

        // Mostrar la cantidad de medios de transporte en la flota
        System.out.println("Cantidad de medios de transporte en la flota: " + flota.obtenerCantidadMedios());

        // Mostrar la lista de medios de transporte en la flota
        System.out.println("Lista de medios de transporte en la flota: ");
        for (MedioDeTransporte medio : flota.obtenerListaMedios()) {
            System.out.println(medio);
        }

        // Mostrar historial de mantenimientos
        System.out.println("\nHistorial de mantenimientos:");
        System.out.println("Autobús: " + autobus.getHistorialDeMantenimiento());
        System.out.println("Avión: " + avion.getHistorialDeMantenimiento());
        System.out.println("Caballo: " + caballo.getHistorialDeMantenimiento());

    }
}