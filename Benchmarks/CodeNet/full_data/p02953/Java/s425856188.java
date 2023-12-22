import java.util.Scanner;

public class C136 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N+1];

        for(int i = 0; i < N; i++) A[i] = sc.nextInt();
        for(int i = 0; i < N-1; i++) {
            B[i+1] = A[i+1] - A[i];
        }
        
        int res = 0;
        for(int i = 0; i < N+1; i++) {
            if(B[i] < 0) {
                res += B[i];
            }
        }
        if(res < -1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
