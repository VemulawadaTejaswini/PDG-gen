import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int T = scanner.nextInt();
        double A = (double) scanner.nextInt();

        Map<Integer, Double> map = new TreeMap<>();

        for (int i = 0; i < N; i++) {
            map.put(i + 1, Math.abs(A - (T - (scanner.nextInt() * 0.006))));
        }

        System.out.println(map.entrySet().stream().sorted(Map.Entry.comparingByValue()).findFirst().get().getKey());
    }
}