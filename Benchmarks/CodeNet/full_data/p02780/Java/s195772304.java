import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int[] p = new int[n];
        for(int i = 0; i < n; i++) {
            p[i] = Integer.parseInt(sc.next());
        }
        
        long[] sum = new long[1001];
        for(int i = 1; i <= 1000; i++) {
            sum[i] = sum[i - 1] + i;
        }
        
        double result = 0;
        for (int i = 0; i < k; i++) {
            result += sum[p[i]] / (double) p[i];
        }
        double preValue = result;
        for(int i = k; i < p.length; i++) {
            double minus = sum[p[i - k]] / (double) p[i - k];
            double plus = sum[p[i]] / (double) p[i];
            double value = preValue + plus - minus;
            preValue = value;
            result = Math.max(result, value);
        }
        
        System.out.println(result);
    }
}
