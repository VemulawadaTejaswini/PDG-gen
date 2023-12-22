import java.util.*;
import java.lang.Math;
public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(calc(sc.nextLong(), sc.nextLong(), sc.nextLong()));
        sc.close();
    }

    private static String calc(long A, long B, long K) {
        long resA = A < K ? 0 : A - K;
        long resB = A > K ? B : B < (K - A) ? 0 : B - (K - A);


        return String.format("%d %d", resA, resB);
    }
}