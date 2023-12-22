import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        
        int[] a = new int[N];
        int sum = 0;
        
        a[0] = scanner.nextInt();
        for(int i = 1; i < N; i++) {
            a[i] = scanner.nextInt();
            sum += a[i];
        }
        
        int x = a[0];
        int min = Math.abs(x - sum);
        for(int i = 1; i < N; i++) {
            int calc = Math.abs(x - sum);
            if(calc > Math.abs(x + 2 * a[i] - sum)) {
                x += a[i];
                sum -= a[i];
            } else {
                if(min > calc) {
                    min = calc;
                }
            }
        }
        System.out.println(min);
        
    }
}