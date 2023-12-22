import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] B = new int[N];
        long sumB = 0;
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt() - (i + 1);
            sumB = sumB + B[i];
        }
        long avaB = Math.round((double)sumB/N);

        long result0 = 0;
        long result1 = 0;
        long result2 = 0;

        for (int i = 0; i < N; i++) {
            result0 = result0 + Math.abs( B[i] - (avaB - 1) );
            result1 = result1 + Math.abs( B[i] - avaB );
            result2 = result2 + Math.abs( B[i] - (avaB + 1) );
        }
        long result = Math.min(Math.min(result0,result1),result2);
        System.out.println(result);


    }
}
