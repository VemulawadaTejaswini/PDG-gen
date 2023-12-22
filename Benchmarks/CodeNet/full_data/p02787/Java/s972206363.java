import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0 ;i<n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        int[] memo = new int[h+1];
        Arrays.fill(memo, Integer.MAX_VALUE);
        memo[0] = 0;
        for(int i=0; i<h; i++) {
            if(memo[i] == Integer.MAX_VALUE) continue;
            for(int j=0; j<n; j++) {
                int next = Math.min(h, i + a[j]);
                memo[next] = Math.min(memo[next], memo[i] + b[j]);
            }
        }

        System.out.println(memo[h]);


    }

}
