import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = 0;
        double A = 0;

        if (N % 2 == 1) {
            X = (N / 2) + 1;
        }
        else {
            X = (N / 2);
        }
        A = (double)X / N;
        System.out.println(A);
    }
}