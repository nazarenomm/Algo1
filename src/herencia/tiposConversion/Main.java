package herencia.tiposConversion;

public class Main {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[2];
        vehiculos[0] = new Moto();      // Upcasting implícito
        vehiculos[1] = new Auto();      // Upcasting implícito
        
        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.acelerar();
            if (vehiculo instanceof Auto) {
                Auto auto = (Auto) vehiculo;
                auto.subirVentanas();
            }
        }
    }
}
