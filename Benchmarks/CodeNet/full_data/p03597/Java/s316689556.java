import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N,A;
        int kei =0;
        int sum = 0;

        N = sc.nextInt();
        A = sc.nextInt();

        kei = N * N;

        sum = kei - A;

        System.out.print(sum);

    }
}