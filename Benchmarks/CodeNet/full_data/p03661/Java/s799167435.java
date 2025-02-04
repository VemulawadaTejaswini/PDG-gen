import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        
        int[] a = new int[N];
        long y = 0;
        
        a[0] = scanner.nextInt();
        for(int i = 1; i < N; i++) {
            a[i] = scanner.nextInt();
            y += a[i];
        }
        
        long x = a[0];
        long min = Math.abs(x - y);
        for(int i = 1; i < N - 1; i++) {
            x += a[i];
            y -= a[i];
            long calc = Math.abs(x - y);
            if(min > calc) {
                min = calc;
            }
        }
        System.out.println(min);
        
    }
}