import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char vehiculo=sc.nextLine().toUpperCase().charAt(0);
        int velocidad= sc.nextInt();

        System.out.println(vehiculo=='T'? velocidad>120? "Multa para " + vehiculo : "No hay multa para " + vehiculo : vehiculo=='C'? velocidad>100? "Multa para " + vehiculo : "No hay multa para " + vehiculo : velocidad>50? "Multa para " + vehiculo : "No hay multa para " + vehiculo);
    }
}