import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        if(k <= n*m && (k % n == 0 || k % m == 0 || k % (n + m) == 0))
        	System.out.println("Yes");
       	else
       		System.out.println("No");
    }
}
