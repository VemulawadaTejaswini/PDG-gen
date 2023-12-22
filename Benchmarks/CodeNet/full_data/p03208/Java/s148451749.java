import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] h = new int[n];
        for(int i=0; i<n; i++){
            h[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(h);

        int min = Integer.MAX_VALUE;
        for(int i=0; i<n-k+1; i++){
            min = Math.min(min, h[i+k-1] - h[i]);
        }

        System.out.println(min);
    }
}