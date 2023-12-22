import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a*b%2 == 0){
            System.out.println("Even");
            System.exit(0);
        }
        else if(a*b%2 == 1){
            System.out.println("Odd");
        }
        
    }
}