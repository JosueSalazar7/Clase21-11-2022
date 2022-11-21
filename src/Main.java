import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int opcion;
        double canntidad;
        System.out.println("\t****BANCO****");
        System.out.println("\n1. Deposito");
        System.out.println("2. Retiro");
        do {
            System.out.print("\nSeleccione la transaccion que desea realizar: ");
            opcion = sc.nextInt();
        }while(opcion < 1 || opcion > 2);
        switch (opcion){
            case 1:
                System.out.println("\n\tDEPOSITO");
                System.out.print("Ingrese la cantidad a depositar: ");
                canntidad = sc.nextDouble();
                Metodos metodos = new Metodos();
                metodos.ingreso(canntidad);
                break;
            case 2:
                System.out.println("\n\tRETIRO");
                System.out.println("Ingrese la cantidad a ser retirada: ");
                canntidad = sc.nextDouble();
                Metodos metodo = new Metodos();
                metodo.retiro(canntidad);
                break;
        }
    }
}