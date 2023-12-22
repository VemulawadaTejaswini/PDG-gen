import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int res = 0;
        int avg = 0;
        for(int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
            avg += A[i];
        }
        avg = (int)Math.round((double)avg / n);
        for(int i = 0; i < n; i++) res += (int)Math.pow(A[i] - avg, 2);
        System.out.println(res);
    }
}
