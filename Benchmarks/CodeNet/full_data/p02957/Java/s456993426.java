import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
       Scanner in= new Scanner(System.in);
        int a=in.nextInt(),b=in.nextInt();
        if(a%2==b%2){
            System.out.println((a+b)/2);
        }else {
            System.out.println("IMPOSSIBLE");
        }


       }
}