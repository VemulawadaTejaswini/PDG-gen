import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }
        TreeSet<Integer> numsLeft = new TreeSet<>();
        TreeSet<Integer> indexesLeft = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            numsLeft.add(i);
            indexesLeft.add(i);
        }
        int res = 0;
        while (!numsLeft.isEmpty()) {
            int max = -1;
            int maxI = -1;
            for (int i : numsLeft) {
                int val = Math.max(i - indexesLeft.first(), indexesLeft.last() - i) * arr[i];
                if (val > max) {
                    max = val;
                    maxI = i;
                }
            }
            if (maxI - indexesLeft.first() >= indexesLeft.last() - maxI) {
                indexesLeft.remove(indexesLeft.first());
            } else {
                indexesLeft.remove(indexesLeft.last());
            }
            numsLeft.remove(maxI);
            res += max;
        }
        System.out.println(res);
    }
}