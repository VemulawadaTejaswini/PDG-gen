import java.util.Scanner;

public class test {
    public static void main(String[] args) {

            Scanner put = new Scanner(System.in);

            int a  = put.nextInt();
            int b = put.nextInt();
            int c  = put.nextInt();
            if((a + b + c) >= 22) System.out.println("bust"); 
            else System.out.println("win");

    }
}