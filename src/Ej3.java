import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1,n2,n3,media;
        System.out.println("Introduce la primera nota");
        n1=sc.nextFloat();
        System.out.println("Introduce la segunda nota");
        n2=sc.nextFloat();
        System.out.println("Introduce la tercera nota");
        n3=sc.nextFloat();

        media=(n1+n2+n3)/3;
        System.out.println("La nota final es: " + media);
        System.out.println(media>=5? "Esta aprobado" : "Esta suspenso");
    }
}
