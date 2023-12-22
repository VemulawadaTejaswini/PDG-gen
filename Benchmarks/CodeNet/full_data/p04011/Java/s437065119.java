import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt(), sum = 0;
        
        if (n<k) {
            sum = n*x;
        } else {
            sum = (k*x) + (n-k)*y;
        }
        System.out.println(sum);
    }
}
