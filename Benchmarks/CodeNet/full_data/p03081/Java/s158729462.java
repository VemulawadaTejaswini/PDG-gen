import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        int q = sc.nextInt();

        char[] s = sc.next().toCharArray();
        HashMap<Character, TreeSet<Integer>> keyToIndexList = new HashMap<>('Z' - 'A' + 1);
        for (char i = 'A'; i <= 'Z'; i++) {
            keyToIndexList.put(i, new TreeSet<Integer>());
        }

        for (int i = 0; i < s.length; i++) {
            Set<Integer> set = keyToIndexList.get(s[i]);
            set.add(i);
        }

        int[] golems = new int[n];
        Arrays.fill(golems, 1);
        int remain = n;
        for (int i = 0; i < q; i++) {
            char t = sc.next().charAt(0);
            char d = sc.next().charAt(0);

            TreeSet<Integer> indexSet = keyToIndexList.get(t);
            if (d == 'L') {
                for (Integer index : indexSet) {
                    if (index == 0) {
                        remain -= golems[0];
                        golems[0] = 0;
                    } else {
                        golems[index - 1] += golems[index];
                        golems[index] = 0;
                    }
                }
            } else {
                for (Integer index : indexSet.descendingSet()) {
                    if (index == n - 1) {
                        remain -= golems[n - 1];
                        golems[n - 1] = 0;
                    } else {
                        golems[index + 1] += golems[index];
                        golems[index] = 0;
                    }
                }
            }
        }

        System.out.println(remain);
    }
}