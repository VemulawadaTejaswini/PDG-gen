import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            sum += a[i];
        }
        sc.close();

        double ave = (double)(sum) / (double)n;
        double min = 10000.0;
        int minpos = 0;
        for(int i=0; i<n; i++){
            if(Math.abs(a[i] - ave) < min){
                min = Math.abs(a[i] - ave);
                minpos = i;
            }
        }

        System.out.println(minpos);
    }
}