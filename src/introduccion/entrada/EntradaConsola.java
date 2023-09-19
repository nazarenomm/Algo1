package introduccion.entrada;

import java.util.Scanner;
// import static introduccion.salida.SalidaConsola;

public class EntradaConsola {
    public static void main(String[] args){
        int numeroLineas = Integer.parseInt(args[0]);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i< numeroLineas; i++){
            System.out.println("Ingrese un mensaje");
            String mensaje = sc.nextLine();
            introduccion.salida.SalidaConsola.mostrar(mensaje);
        }
        sc.close();
    }
}
