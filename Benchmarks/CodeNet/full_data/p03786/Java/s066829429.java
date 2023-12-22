import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] a=new long[n];
        long[] sum=new long[n];
        for(int i=0;i<n;i++) {
            a[i] = sc.nextLong();
        }
        Arrays.sort(a);
        sum[0]=a[0];
        for(int i=0;i<n;i++){
            if(i>0)sum[i]=sum[i-1]+a[i];
        }

        int t=0;
        for(int i=0;i<n-1;i++){
            if(sum[i]*2<a[i+1]) {
                t = i+1;
            }
        }
        System.out.println(n-t);
    }
}