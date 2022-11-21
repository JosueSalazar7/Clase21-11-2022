import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);

    int CI;
    public void ingreso(double cantidad){
        cuenta saldo = new cuenta();
        saldo.setCantidad(saldo.getCantidad() + cantidad);
        System.out.println("\nSu saldo actual es: " + saldo.getCantidad());
    }
    public void retiro(double canntidad){
        cuenta saldo = new cuenta();
        saldo.setCantidad(saldo.getCantidad() - canntidad);
        System.out.println("\nSu saldo actual es: " + saldo.getCantidad());
    }
}
