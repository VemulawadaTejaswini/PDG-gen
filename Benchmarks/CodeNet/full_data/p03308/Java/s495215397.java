import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int minval = Integer.MAX_VALUE;
        int maxval = Integer.MIN_VALUE;
        for (int i=0; i<n; i++) {
            int x = sc.nextInt();
            minval = Math.min(minval, x);
            maxval = Math.max(maxval, x);
        }
        System.out.println(maxval-minval);
    }
}