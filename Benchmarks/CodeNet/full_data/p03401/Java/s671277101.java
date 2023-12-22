import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N+2];
        A[0] = 0;
        A[N+1] = 0;
        int sum = 0;
        int[][] diff = new int[N+1][2];
        for(int i = 1; i <= N; i++){
            A[i] = sc.nextInt();
            diff[i-1][0] = Math.abs(A[i-1] - A[i]);
            sum += diff[i-1][0];
            if(diff[i-1][0] !=0) diff[i-1][1] = A[i-1] - A[i] <0 ? -1: 1;
        }
        diff[N][0] = Math.abs(A[N]);
        sum += diff[N][0];
        if(diff[N][0] !=0) diff[N][1] = A[N] <0 ? -1: 1;
        for(int i = 1; i <= N; i++){
            if(diff[i-1][1] * diff[i][1] >-1 ) System.out.println(sum);
            else System.out.println(sum - 2*Math.min(diff[i-1][0], diff[i][0]));
        }
        sc.close();
    }

}
