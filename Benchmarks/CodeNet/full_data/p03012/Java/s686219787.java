import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
            if(0 < i) w[i] += w[i-1];
        }
        int tmp = Integer.MAX_VALUE;
        for (int i = 0; i < n-1; i++) {
            if(Math.abs(w[n-1] - w[i] *2) < tmp) tmp = Math.abs(w[n-1] - w[i] *2);
        }
        System.out.println(tmp);
        sc.close();

    }

}
