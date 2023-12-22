import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        double Asum = 0;

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            Asum += A[i];
        }

        Asum=Asum/(4*M);

        Arrays.sort(A);

        for (int i = 0; i < M; i++) {
            if(A[A.length-1-i]>=Asum){
                continue;
            }else{
                System.out.println("No");
                System.exit(0);
            }
        }

        System.out.println("Yes");
    }
}