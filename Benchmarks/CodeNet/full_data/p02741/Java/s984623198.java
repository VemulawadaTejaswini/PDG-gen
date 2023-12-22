import java.util.*;
import java.math.*;

class MainC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
      	double ab = Math.sqrt(a) + Math.sqrt(b);
      	double cc = Math.sqrt(c);
        if (ab < cc)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}