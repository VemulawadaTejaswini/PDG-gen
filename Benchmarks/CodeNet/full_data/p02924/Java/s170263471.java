import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        long N;

        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextLong();
        }
        long result = ((N-1 + 1) * (N-1))/2;

        System.out.println( result);
    }

}
