import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] aArr = new int[n];

        for (int i = 0; i < n; i++) {
            aArr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> xCandidate = new HashMap<>();
        for (int i = 0; i < aArr.length; i++) {
            int plus = aArr[i];
            int normal = aArr[i];
            int minus = Math.max(aArr[i], 0);

            if (!xCandidate.containsKey(plus)) xCandidate.put(plus, 1);
            if (!xCandidate.containsKey(normal)) xCandidate.put(normal, 1);
            if (!xCandidate.containsKey(minus)) xCandidate.put(minus, 1);
        }

        int count = 0;
        for (Map.Entry<Integer, Integer> entry: xCandidate.entrySet()) {
            int tmpCount = 0;
            int x = entry.getKey();// xの値
            for (int i = 0; i < aArr.length; i++) {
                if (aArr[i] == x || aArr[i] == x+1 || aArr[i] == x-1 ) tmpCount++;
            }

            if (count < tmpCount) count = tmpCount;
        }

        System.out.println(count);
    }
}
