import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] left = new long[n];
        long[] right = new long[n];
        long result = 0;

        for (int i = 0; i < n; i++){
            left[i] = scanner.nextInt();
            right[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                result += Cab(left[i]+left[j],right[i]+right[j]);
            }
        }
        System.out.println(result);
    }
    public static long Cab(long a, long b) {
        return jc(a+b)/(jc(a)*jc(b));
    }
    // 阶乘
    public static long jc(long n) {
        long result = 1;
        for (long i = 1; i <= n; i++) {
            result = i * result;
        }
        return result;
    }
}