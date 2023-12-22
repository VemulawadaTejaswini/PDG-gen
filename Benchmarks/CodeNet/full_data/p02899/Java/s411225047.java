import java.util.Scanner;

public class Main {
    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        for(int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        for(int i = 1; i <= N; i++) {
            int j = 0;
            while(A[j] != i) {
                j += 1;
            }
            System.out.print( (j+1) + " ");
        }
        System.out.println();

    }
}
