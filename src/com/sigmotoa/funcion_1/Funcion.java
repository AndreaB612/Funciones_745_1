import java.util.Scanner;

public class Funcion {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ DE FUNCIONES ---");
            System.out.println("1. Sumar 2 números");
            System.out.println("2. Multiplicar 2 números con sumas");
            System.out.println("3. Potenciar 2 números con sumas");
            System.out.println("4. Calcular el factorial de un número");
            System.out.println("5. Calcular el área de un cuadrado");
            System.out.println("6. Calcular el área de un círculo");
            System.out.println("7. Calcular el volumen de un cono");
            System.out.println("8. Mostrar los n números de la serie de Fibonacci");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    sumarNumeros(leer);
                    break;
                case 2:
                    multiplicarConSumas(leer);
                    break;
                case 3:
                    potenciarConSumas(leer);
                    break;
                case 4:
                    calcularFactorial(leer);
                    break;
                case 5:
                    calcularAreaCuadrado(leer);
                    break;
                case 6:
                    calcularAreaCirculo(leer);
                    break;
                case 7:
                    calcularVolumenCono(leer);
                    break;
                case 8:
                    mostrarSerieFibonacci(leer);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        leer.close();
    }

    public static void sumarNumeros(Scanner leer) {
        System.out.print("Ingrese el primer número: ");
        int num1 = leer.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = leer.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma es: " + suma);
    }

    public static void multiplicarConSumas(Scanner leer) {
        System.out.print("Ingrese el primer número: ");
        int num1 = leer.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = leer.nextInt();
        int producto = 0;
        for (int i = 0; i < num2; i++) {
            producto += num1;
        }
        System.out.println("El producto es: " + producto);
    }

    public static void potenciarConSumas(Scanner leer) {
        System.out.print("Ingrese la base: ");
        int base = leer.nextInt();
        System.out.print("Ingrese el exponente: ");
        int exponente = leer.nextInt();
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            int temp = 0;
            for (int j = 0; j < base; j++) {
                temp += resultado;
            }
            resultado = temp;
        }
        System.out.println("El resultado de la potencia es: " + resultado);
    }

    public static void calcularFactorial(Scanner leer) {
        System.out.print("Ingrese un número: ");
        int num = leer.nextInt();
        int factorial = 1;
        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("El factorial es: " + factorial);
    }

    public static void calcularAreaCuadrado(Scanner leer) {
        System.out.print("Ingrese el lado del cuadrado: ");
        double lado = leer.nextDouble();
        double area = lado * lado;
        System.out.println("El área del cuadrado es: " + area);
    }

    public static void calcularAreaCirculo(Scanner leer) {
        System.out.print("Ingrese el radio del círculo: ");
        double radio = leer.nextDouble();
        double area = Math.PI * radio * radio;
        System.out.println("El área del círculo es: " + area);
    }

    public static void calcularVolumenCono(Scanner leer) {
        System.out.print("Ingrese el radio del cono: ");
        double radio = leer.nextDouble();
        System.out.print("Ingrese la altura del cono: ");
        double altura = leer.nextDouble();
        double volumen = (Math.PI * radio * radio * altura) / 3;
        System.out.println("El volumen del cono es: " + volumen);
    }

    public static void mostrarSerieFibonacci(Scanner leer) {
        System.out.print("Ingrese el número de términos: ");
        int n = leer.nextInt();
        int a = 0, b = 1;
        System.out.print("Serie Fibonacci: " + a + " " + b);
        for (int i = 2; i < n; i++) {
            int siguiente = a + b;
            System.out.print(" " + siguiente);
            a = b;
            b = siguiente;
        }
        System.out.println();
    }
}
