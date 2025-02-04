import java.util.*;

public class Main {
    static long MOD = 1000000007;

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Map<Integer, Integer> numCount = new HashMap<>();
        Set<Integer> potentialX = new HashSet<>();

        for(int ai: a) {
            int count = numCount.getOrDefault(ai, 0) + 1;
            numCount.put(ai, count);
            potentialX.add(ai - 1);
            potentialX.add(ai);
            potentialX.add(ai + 1);
        }

        int maxCount = -1;
        for(int x: potentialX) {
            int count = numCount.getOrDefault(x - 1, 0)
                    + numCount.getOrDefault(x, 0)
                    + numCount.getOrDefault(x + 1, 0);
            maxCount = Math.max(maxCount, count);
        }

        System.out.println(maxCount);
    }
}