import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if(a-c<=d){
            System.out.println("Yes");
        }else{
            if(a-b<=d&&b-c<=d){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }

}