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
        long lastA = Arrays.stream(wordArr).filter(s -> s.endsWith("A")).count();
        // 末尾B
        long startB = Arrays.stream(wordArr).filter(s -> s.startsWith("B")).count();
        // 内部AB
        long containsAB = Arrays.stream(wordArr).filter(s -> s.contains("AB")).count();

        long min = Math.min(lastA, startB);
        System.out.println(containsAB + min);
    }
}
