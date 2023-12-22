import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long N = in.nextInt();
        long M = in.nextInt();
        long result = 0;

        if (N == 0 || M == 0) {
            result = 0;
        } else if (N >= M / 2) {
            result = M / 2;
            N -= M / 2;
            N -= 2;
            while (N >= 0) {
                result++;
                N -= 3;
            }
        } else {
            result = N;
            M -= 2 * N;
            M -= 4;
            while (M >= 0) {
                result++;
                M -= 4;
            }
        }

        System.out.println(result);
    }
}