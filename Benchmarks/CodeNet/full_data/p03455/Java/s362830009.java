import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());

        if(a * b % 2 == 0) System.out.println("Even");
        else System.out.println("Odd");

        sc.close();
    }
}