import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt() % 2 == 0 ? 2 : 1;
        }
        long sum = (long)Math.pow(3, n);
        long minus = 1;
        for (Integer v: array
             ) {
            minus *= v;
        }
        System.out.println(sum - minus);
    }
}