import java.util.Scanner;
public class EscapeRoomJava {
/**
 * Alumnos: Victor Iglesias, Seifeddin Benkaddour, Rida El Hassani
 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("   CODEWEEK - ESCAPE ROOM ESPACIAL EN JAVA   ");
        System.out.println("==================================================");
        System.out.println("Te has despertado en el laboratorio central de una nave");
        System.out.println("espacial. Los sistemas de soporte vital fallan y las");
        System.out.println("puertas blindadas se han cerrado automáticamente.");
        System.out.println("Para escapar y activar las cápsulas de emergencia,");
        System.out.println("tendrás que superar dos sistemas de seguridad.");
        System.out.println("¡Cuidado! Solo dispones de 3 intentos por prueba.");
        System.out.println("==================================================\n");

        int intentosPrueba1 = 3;
        boolean superadaPrueba1 = false;

        System.out.println("--- PRUEBA 1: El panel de la puerta principal ---");
        System.out.println("En la pantalla parpadea una secuencia numérica incompleta:");
        System.out.println("Secuencia: 4, 8, 16, 32, ...");
        System.out.println("Pista: Multiplica el número anterior por 2 para hallar el siguiente.");

        while (intentosPrueba1 > 0 && !superadaPrueba1) {
            System.out.print("\nIntroduce el siguiente número de la secuencia: ");
            int respuesta1 = scanner.nextInt();

            if (respuesta1 == 64) {
                System.out.println("¡Correcto! El sector 1 ha sido desbloqueado.");
                superadaPrueba1 = true;
            } else {
                intentosPrueba1--;
                if (intentosPrueba1 > 0) {
                    System.out.println("Código incorrecto. Te quedan " + intentosPrueba1 + " intentos.");
                }
            }
        }

        if (!superadaPrueba1) {
            System.out.println("\n[¡ALARMA!] Se han agotado los intentos en la Prueba 1.");
            System.out.println("La nave ha colapsado. FIN DE LA PARTIDA (Derrota).");
            scanner.close();
            return;
        }

        int intentosPrueba2 = 3;
        boolean superadaPrueba2 = false;

        System.out.println("\n--------------------------------------------------");
        System.out.println("--- PRUEBA 2: Contraseña del núcleo de energía ---");
        System.out.println("Has accedido al pasillo final, pero el panel de salida");
        System.out.println("pide resolver una operación lógica con los protocolos.");
        System.out.println("Acertijo: 'Tengo 3 unidades de energía base, y cada módulo");
        System.out.println("de propulsión activo multiplica ese valor por 5'.");
        System.out.println("Si hay 4 módulos activos, ¿cuánta energía total se genera?");

        while (intentosPrueba2 > 0 && !superadaPrueba2) {
            System.out.print("\nIntroduce la respuesta numérica: ");
            int respuesta2 = scanner.nextInt();

            if (respuesta2 == 60) {
                System.out.println("¡Código aceptado! Los motores de emergencia rugen.");
                superadaPrueba2 = true;
            } else {
                intentosPrueba2--;
                if (intentosPrueba2 > 0) {
                    System.out.println("Energía incorrecta. Te quedan " + intentosPrueba2 + " intentos.");
                }
            }
        }

        if (!superadaPrueba2) {
            System.out.println("\n[¡ALARMA!] Se han agotado los intentos en la Prueba 2.");
            System.out.println("El sistema se ha bloqueado definitivamente. FIN DE LA PARTIDA (Derrota).");
            scanner.close();
            return;
        }

        if (superadaPrueba1 && superadaPrueba2) {
            System.out.println("\n==================================================");
            System.out.println("   ¡VICTORIA! HAS ESCAPADO DE LA NAVE CON ÉXITO   ");
            System.out.println("==================================================");
            System.out.println("Las puertas blindadas se abren de par en par.");
            System.out.println("Corres hacia la cápsula de escape y logras eyectarte");
            System.out.println("al espacio exterior justo a tiempo. ¡Buen trabajo!");
            System.out.println("==================================================");
        }
    }
}