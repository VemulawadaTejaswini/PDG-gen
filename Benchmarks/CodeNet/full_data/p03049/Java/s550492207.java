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
        long lastA = Arrays.stream(wordArr).filter(s -> s.endsWith("A")).count(); // O(N)
        long startB = Arrays.stream(wordArr).filter(s -> s.startsWith("B")).count(); // O(N)
        long containsAB = Arrays.stream(wordArr).filter(s -> s.contains("AB")).count(); // O(N)

        long min = Math.min(lastA, startB);

        if (lastA < 1 || startB < 1) {
            System.out.println(containsAB);
        } else {
            System.out.println(containsAB + min);
        }
    }
}
