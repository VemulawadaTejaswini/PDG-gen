import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0;i<n;i++) {
            a[i] = sc.nextInt();
        }

        int[] sum = new int[n*(n-1)/2];
        int p=0;
        for (int i = 0;i < n;i++) {
            for (int j = i + 1;j < n;j++) {
                sum[p++] = a[i] * a[j];
            }
        }
        Arrays.sort(sum);
        System.out.println(sum[k-1]);
    }
}
