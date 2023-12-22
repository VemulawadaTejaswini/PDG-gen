
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Map<Integer, Integer> food = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            int k = scanner.nextInt();
            for (int j = 0; j < k; ++j) {
                int a = scanner.nextInt();
                int likes = food.getOrDefault(a, 0);
                food.put(a, likes + 1);
            }
        }
        long res = food.entrySet().stream()
                .filter(foodLikes -> foodLikes.getValue() == n)
                .count();
        System.out.println(res);
    }
}
