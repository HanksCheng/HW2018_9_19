import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner a1=new Scanner(System.in);
        Scanner b1=new Scanner(System.in);
        Scanner c1=new Scanner(System.in);
        System.out.println("enter  Side a:");
        int a=a1.nextInt();
        System.out.println("enter  Side b:");
        int b=b1.nextInt();
        System.out.println("enter  Side c:");
        int c=c1.nextInt();
        System.out.println( "judge isn't a triangle:");
        if (a<=b&&b<=c){
            System.out.println("pass");
        }
        else{
            System.out.println("false");
        }

    }
}
