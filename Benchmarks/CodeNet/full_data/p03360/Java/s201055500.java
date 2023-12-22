import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
	    int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int max = Math.max(a, Math.max(b, c));      
        int sum = (int)Math.pow(2, k) * max + a + b + c - max;
        System.out.println(sum);
      
    }
}
