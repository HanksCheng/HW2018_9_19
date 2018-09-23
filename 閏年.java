import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner year=new Scanner(System.in);
        System.out.println("請輸入年份:");
        int YR=year.nextInt();
        if (YR%4==0){
            System.out.println("閏年");
        }
        else if (YR%100==0){
            System.out.println("平年");
        }
        else if (YR%400==0){
            System.out.println("閏年");
        }
        else{
            System.out.println("平年");
        }
    }
}
