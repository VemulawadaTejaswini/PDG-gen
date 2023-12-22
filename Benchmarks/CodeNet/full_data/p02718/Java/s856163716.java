import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        int sum = 0;
        for(int i=0; i<N; i++) {
            A[i] = sc.nextInt();
            sum += A[i];
        }
        float check = (float)sum / (4 * M);
        int count = 0;

        for(int i=0; i < N; i++) {
            
            if(A[i] >= check) count++;
        }

        if(count >= M) System.out.println("Yes");
        else System.out.println("No");       
    }
}