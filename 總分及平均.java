import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ch=new Scanner(System.in);
        Scanner en=new Scanner(System.in);
        Scanner mt=new Scanner(System.in);
        System.out.println("國文成績");
        int s1=ch.nextInt();
        System.out.println("英文成績");
        int s2=en.nextInt();
        System.out.println("數學成績");
        int s3=mt.nextInt();
        int total=s1+s2+s3;
        int average=total/3;
        System.out.println("計算總分及平均");
        System.out.println("總分:"+total);
        System.out.println("平均:"+average);
    }
}
