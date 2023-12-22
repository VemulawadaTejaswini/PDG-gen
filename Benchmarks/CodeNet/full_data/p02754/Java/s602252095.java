import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        long mix = A+B;
        if (mix%N == 0) {
            System.out.println(A * (mix/N));
        } else if (A == 0) {
            System.out.println(0);
        } else if (mix < N) {
            System.out.println((A * (N/mix)) + (N-mix));
        } else if (N < A) {
            System.out.println(N);
        } else if (A <= N) {
            System.out.println(A);
        }
    }
}