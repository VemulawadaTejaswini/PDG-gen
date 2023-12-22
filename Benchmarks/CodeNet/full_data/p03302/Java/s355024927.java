import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        int b = sc2.nextInt();
        if(b<=15&&a>=1){
                if(a+b == 15)
                    System.out.println("+");
                    else if(a*b == 15)
                    System.out.println("*");
                else 
                    System.out.println("x");
        }
    }
}