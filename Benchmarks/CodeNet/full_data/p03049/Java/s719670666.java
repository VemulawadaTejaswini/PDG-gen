import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] wordArr = new String[N];
        for (int i = 0; i < N; i++) {
            wordArr[i] = sc.next();
        }
        // 末尾A
        long A = Arrays.stream(wordArr).filter(s -> s.endsWith("A") && !s.startsWith("B")).count();
        // 先頭B
        long B = Arrays.stream(wordArr).filter(s -> s.startsWith("B") && !s.endsWith("A")).count();
        // 先頭Bかつ末尾A
        long BA = Arrays.stream(wordArr).filter(s -> s.startsWith("B") && s.endsWith("A")).count();
        // 内部AB
        long containsAB = Arrays.stream(wordArr).filter(s -> s.contains("AB")).count();

        long min = Math.min(A + BA, B + BA);

        if (A == 0 && B == 0) {
            System.out.println(containsAB + BA - 1);
        } else {
            System.out.println(containsAB + min);
        }
    }
}
