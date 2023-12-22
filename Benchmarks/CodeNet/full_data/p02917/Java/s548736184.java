import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] b = new int[n];

        for (int i=0; i<n-1; i++){
            b[i] = sc.nextInt();
        }

        int[] a = new int[n];
        a[0] = b[0];

        for (int i=1; i<n; i++){
            a[i] = Math.min(b[i-1], b[i]);
        }

        long sum = 0;

        for (int i=0; i<n-1; i++){
            sum += a[i];
        }
        sum += b[n-2];
        System.out.println(sum);
    }
}