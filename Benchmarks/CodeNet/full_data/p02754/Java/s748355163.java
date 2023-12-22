import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    	long n = sc.nextLong();
      	long a = sc.nextLong();
      	long b = sc.nextLong();

      	long period = n / (a + b);
      	long remainder = n % (a + b);

      	long ans = remainder > a ? period * a + a : period * a + remainder;

      	System.out.println(ans);
    }
}