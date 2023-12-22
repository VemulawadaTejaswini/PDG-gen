import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double a2 = (double)n/ 3;
        double a = Math.cbrt(a2);
        System.out.println(a2 * a2 * a2);
    }
}
