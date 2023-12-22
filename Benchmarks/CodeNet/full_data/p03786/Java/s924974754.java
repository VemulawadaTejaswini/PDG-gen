import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        long[] sum = new long[n+1];
        sum[0]=0;
        for (int i=0;i<n;i++)a[i]=sc.nextInt();
        Arrays.sort(a);
        for (int i=0;i<n;i++)sum[i+1]= sum[i]+a[i];
        int maxF = 0;
        for (int i=0;i<n;i++){
            if(sum[i]*2<a[i]){
                maxF=i;
            }
        }
        System.out.println(n-maxF);
    }
}
