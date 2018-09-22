import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner a1= new Scanner(System.in);
        Scanner a2= new Scanner(System.in);
        System.out.println("輸入第一個數字後按ENTER");
        int v1=a1.nextInt();
        System.out.println("輸入第二個數字後按ENTER");
        int v2=a2.nextInt();
        System.out.println("計算其和、差、積");
        int ANS1=v1+v2;
        int ANS2=v1-v2;
        int ANs3=v1*v2;
        System.out.println("和"+ANS1);
        System.out.println("差"+ANS2);
        System.out.println("積"+ANs3);
    }
}
