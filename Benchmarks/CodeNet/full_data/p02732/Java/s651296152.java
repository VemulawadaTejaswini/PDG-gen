import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int ai = scanner.nextInt();
            a[i]  = ai;
            count.put(ai, count.getOrDefault(ai,0)+1);
        }
        long sum = 0;
        for (Integer value : count.values()) {
            sum+=value*(value-1)/2;
        }
        for (int i = 0; i < n; i++) {
            Integer ac = count.get(a[i]);
            System.out.println(sum - (ac-1));
        }
    }
}
