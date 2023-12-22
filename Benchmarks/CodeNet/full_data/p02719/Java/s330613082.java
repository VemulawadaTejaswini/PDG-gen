import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int remainder = n % k;
        int smallest = remainder;
        while (Math.abs(k - remainder) < smallest) {
        	smallest = remainder;
        }
        System.out.println(remainder);
    }
}
