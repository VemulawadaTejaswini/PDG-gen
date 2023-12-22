import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long[] a = new long[n + 1];
        long[] b = new long[n];
        long sum = 0;
        for(int i = 0; i < n + 1; i++){
            a[i] = scan.nextInt();
            sum += a[i];
        }
        for(int i = 0; i < n; i++) b[i] = scan.nextInt();
        for(int i = 0; i < n; i++){
            if(a[i] <= b[i]){
                a[i + 1] = Math.max(0, a[i + 1] - b[i] + a[i]);
                a[i] = 0;
            }else{
                a[i] -= b[i];
            }
        }
        long out = 0;
        for(int i = 0; i < n + 1; i++) out += a[i];
        System.out.println(sum - out);
        scan.close();
    }
}