import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static Map<String, Integer> map = new HashMap<>();
    static {
        map.put("M", 0);
        map.put("A", 1);
        map.put("R", 2);
        map.put("C", 3);
        map.put("H", 4);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        int[] march = new int[5];
        for (int i = 0; i < N; i++) {
            String initial = String.valueOf(sc.next().charAt(0));
            if (map.containsKey(initial)) {
                march[map.get(initial)]++;
            }
        }

        long ans = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                for (int k = j + 1; k < 5; k++) {
                    int mi = march[i];
                    int mj = march[j];
                    int mk = march[k];
                    ans += mi * mj * mk;
                    // System.err.printf("%s %s %s = ans%s \n", mi, mj, mk, ans);
                }
            }
        }

        System.out.println(ans);
    }
}
