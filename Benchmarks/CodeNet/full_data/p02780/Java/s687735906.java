import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] p = new int[n];
        double max = 0;
        double cmax = 0;
        for(int i = 0; i < n; i++){
            p[i] = scan.nextInt();
        }
        for(int i = 0; i < n - k + 1; i++){
            for(int j = 0; j < k; j++) cmax += ex(p[i + j]);
            max = Math.max(max, cmax);
            cmax = 0;
        }
        System.out.println(max);
    }
    public static double ex(int x){
        return (double) (x + 1) / 2;
    }
}
