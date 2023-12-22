import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> factoringN = new HashMap<>();
        for (int i = 2; i <= n; i++) {
            int num = i;
            for (int j = 2; j <= 10 ; j++) {
                while (num % j == 0) {
                    num /= j;
                    add(factoringN, j);
                }
            }
            if(num != 1) {
                add(factoringN, num);
            }
        }
        long over4 = factoringN.values().stream().filter(integer -> integer >= 4).count();
        long over2 = factoringN.values().stream().filter(integer -> integer == 2 || integer == 3).count();
        long over14 = factoringN.values().stream().filter(integer -> integer >= 14).count();
        long over4_14 = factoringN.values().stream().filter(integer -> integer >= 4 && integer < 14).count();
        long over24 = factoringN.values().stream().filter(integer -> integer >= 24).count();
        long over2_24 = factoringN.values().stream().filter(integer -> integer >= 2 && integer < 24).count();
        long over74 = factoringN.values().stream().filter(integer -> integer >= 74).count();
        System.out.println(over4 * (over4 - 1) * (over2 + over4 - 2) / 2 + over14 * (over4_14 + over14 - 1) + over24 * (over2_24 + over24 -1) + over74);
    }

    private static void add(Map<Integer, Integer> m, int i) {
        if(m.containsKey(i)) m.put(i, m.get(i) + 1);
        else m.put(i, 1);
    }
}