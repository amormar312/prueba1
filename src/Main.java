import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(x<0 ? x + " es menor que 0" : x<=100 ? x + " esta entre 0 y 100" : x + " es mayor que 100");
    }
}