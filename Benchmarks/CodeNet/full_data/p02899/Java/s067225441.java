import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // input -> index
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            map.put(sc.nextInt(), i);
        }
        List<Map.Entry<Integer, Integer>> entries =
        map.entrySet().stream().sorted(java.util.Map.Entry.comparingByKey()).collect(Collectors.toList());

        for (Map.Entry<Integer, Integer> entry : entries) {
            System.out.print(entry.getValue() + " ");
        }
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}