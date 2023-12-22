import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // x^2 + x - 2n = 0;
        double x = Math.sqrt(2 * n + (1/4)) - 1/2;
        int answer = (int)Math.ceil(x);
        System.out.println(answer);
    }
}
