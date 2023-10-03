import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float j1,j2,pr;
        boolean ganador1,ganador2;
        System.out.print("Jugador 1 diga el precio: ");
        j1=sc.nextFloat();
        System.out.print("Jugador 2 diga el precio: ");
        j2=sc.nextFloat();
        System.out.print("El precio real es: ");
        pr=sc.nextFloat();
        ganador1=j1<pr && (j1>j2 || j2>pr);
        ganador2=j2<pr && (j2>j1 || j1>pr);
        System.out.println("¿Gana J1? " + ganador1 + " ¿Gana J2? " + ganador2);
    }
}
