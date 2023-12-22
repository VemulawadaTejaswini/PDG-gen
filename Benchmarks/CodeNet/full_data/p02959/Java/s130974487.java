import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] a = new int[n+1];
        int[] b = new int[n];

        for(int i = 0; i < n+1; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            b[i] = sc.nextInt();
        }

        int[] tempa = new int[n+1];
        int[] tempb = new int[n];

        for(int i = 0; i < n+1; i++){
            tempa[i] = a[i];
        }
        for(int i = 0; i < n; i++){
            tempb[i] = b[i];
        }


        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < n; i++){
            int min1 = Math.min(a[i], b[i]);
            a[i] -= min1;
            b[i] -= min1;
            sum1 += min1;
            int min2 = Math.min(a[i+1], b[i]);
            a[i] -= min2;
            b[i] -= min2;
            sum1 += min2;
        }

        
        for(int i = n-1; i >= 0; i--){
            int min1 = Math.min(tempa[i+1], tempb[i]);
            tempa[i+1] -= min1;
            tempb[i] -= min1;
            sum2 += min1;
            int min2 = Math.min(tempa[i], tempb[i]);
            tempa[i] -= min2;
            tempb[i] -= min2;
            sum2 += min2;
        }

        System.out.println(Math.max(sum1, sum2));
        

    }
}