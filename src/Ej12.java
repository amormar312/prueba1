import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ancho, largo, baldosas, metros, tamanyo, metrobal;
        System.out.println("Introduce el largo de la habitacion");
        largo=sc.nextInt();
        System.out.println("Introduce el ancho de la habitacion");
        ancho=sc.nextInt();
        metros=largo*ancho;
        System.out.println("Cuantas baldosas tiene?");
        baldosas=sc.nextInt();
        System.out.println("Cuanto mide cada baldosa?(en metros cuadrados)");
        tamanyo=sc.nextInt();
        metrobal=baldosas*tamanyo;

        System.out.println(metros<=metrobal? "Tiene suficientes baldosas": "No tiene suficientes");

    }
}