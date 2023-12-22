import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        if (n == 1 && m == 0) {
            System.out.println("0");
            return;
        }

        List<Integer> digits = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int digit = sc.nextInt();
            int number = sc.nextInt();
            digits.add(digit);
            numbers.add(number);
        }

        if (n > 1) {
            for (int i = 0; i < m; i++) {
                if (digits.get(i) == 1 && numbers.get(i) == 0) {
                    System.out.println("-1");
                    return;
                }
            }
        }

        boolean isDuplicate = (digits.size() != new HashSet<>(digits).size()) && (numbers.size() == new HashSet<>(numbers).size());
        if (isDuplicate) {
            System.out.println("-1");
            return;
        }

        int[] result = new int[n];
        for (int i = 0; i < m; i++) {
            result[digits.get(i)-1] = numbers.get(i);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(result[i]);
        }
    }
}