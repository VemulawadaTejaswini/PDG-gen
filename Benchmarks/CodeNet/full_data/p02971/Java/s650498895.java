import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        A[0] = sc.nextInt();
        A[1] = sc.nextInt();
        int max;
        int max2;
        if (A[0] > A[1]) {
            max = A[0];
            max2 = A[1];
        } else if (A[0] < A[1]) {
            max = A[1];
            max2 = A[0];
        } else {
            max = A[0];
            max2 = A[0];
        }
        for(int i=2; i<N; i++){
            A[i] = sc.nextInt();
            if (A[i] > max) {
                max = A[i];
            } else if (A[i] > max2) {
                max2 = A[i];
            }
        }

        for (int i=0; i<N; i++) {
            if(A[i] == max) {
                System.out.println(max2);
            } else {
                System.out.println(max);
            }
        }
    }
}