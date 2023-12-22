import java.util.Scanner;
import java.util.Random;;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int Q = scan.nextInt();
        String S = scan.next();
        int A[] = new int[N+1];

        for(int i = 0; i < N-1; i++){
            if(S.charAt(i) == 'A' && S.charAt(i + 1) == 'C'){
                A[i+2] += 1;
            }
        }

        for(int i = 1; i < N; i++){
            A[i+1] += A[i];
        }
        A[0] = 0;

        for(int i = 0; i < Q; i++){
            int l = scan.nextInt();
            int r = scan.nextInt();
            System.out.println(A[r]-A[l]);
        }
    }
}
