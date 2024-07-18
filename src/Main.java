import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        camiconeta miVehiculo = new camiconeta("Mitsubishi ", "Lancer evo", "Hennrry", "Blanco");

        int opcion;
        do {
            System.out.println("\n--- Menú de Opciones ---");
            System.out.println("1. Encender el vehículo       2. Apagar el vehículo");
            System.out.println("3. Chocar                     4. Encender las luces");
            System.out.println("4. Encender las luces         5. Bajar los vidrios");
            System.out.println("6. Acelerar                   7. Frenar");
            System.out.println("8. Tocar la bocina            9. Girar a la izquierda");
            System.out.println("10. Girar a la derecha        11. Revisar nivel de combustible");
            System.out.println("12. Subir pasajeros           13. Bajar pasajeros");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            opcion= scanner.nextInt();

            switch (opcion) {
                case 1:
                    miVehiculo.Encender();
                    break;
                case 2:
                    miVehiculo.Apagar();
                    break;
                case 3:
                    miVehiculo.Chocar();
                    break;
                case 4:
                    miVehiculo.EncenderLuces();
                    break;
                case 5:
                    miVehiculo.BajarVidrios();
                    break;
                case 6:
                    miVehiculo.Acelerar();
                    break;
                case 7:
                    miVehiculo.Frenar();
                    break;
                case 8:
                    miVehiculo.TocarBocina();
                    break;
                case 9:
                    miVehiculo.GirarIzquierda();
                    break;
                case 10:
                    miVehiculo.GirarDerecha();
                    break;
                case 11:
                    miVehiculo.RevisarCombustible();
                    break;
                case 12:
                    miVehiculo.SubirPasajeros();
                    break;
                case 13:
                    miVehiculo.BajarVidrios();
                    break;


                case 0:
                    System.out.println("Chao!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 0);
    }
}
