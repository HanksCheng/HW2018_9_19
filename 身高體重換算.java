import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cm= new Scanner(System.in);
        Scanner kg= new Scanner(System.in);
        System.out.println("ENTER YOUR HEIGHT:");
        int h=cm.nextInt();
        System.out.println("ENTER YOUR WEIGHT:");
        int w=kg.nextInt();
        float inch=h/2.54f;
        float pound=w/0.454f;
        System.out.println(inch+"inch");
        System.out.println(pound+"pd");
    }
}
