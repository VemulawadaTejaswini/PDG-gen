
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, h, x;
        a = input.nextInt();
        b = input.nextInt();
        h = input.nextInt();
        x = ((a+b)*h)/2;
        System.out.println(x);
    }
    
}
