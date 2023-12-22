import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        int N;
        long[] A;


        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            A = new long[N];
            for (int i = 0; i < A.length; i++) {
                A[i] = sc.nextLong();
            }
        }
        double AD = 0;
        for (int i = 0; i < A.length; i++) {
            AD += (double)1/(double)A[i];
        }
        System.out.println((double)1/AD);

    }

}
