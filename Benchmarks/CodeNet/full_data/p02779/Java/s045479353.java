import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        List<Integer> first = new ArrayList<>();
        first.add(scanner.nextInt());
        String answer = "YES";
        for (int i = 1; i < size; i ++) {
            int new1 = scanner.nextInt();
            if (first.contains(new1)) {
                answer = "NO";
            }
            first.add(new1);
        }
        System.out.println(answer);
    }
}