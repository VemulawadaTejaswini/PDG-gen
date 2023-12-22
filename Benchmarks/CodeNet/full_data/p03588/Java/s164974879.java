import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = cin.nextInt();
            B[i] = cin.nextInt();
        }
        long answ = A[0] + B[0];
        for (int i = 0; i < N; i++) {
            answ = Math.min(A[i] + B[i],answ);
        }
        System.out.println(answ);

    }
}