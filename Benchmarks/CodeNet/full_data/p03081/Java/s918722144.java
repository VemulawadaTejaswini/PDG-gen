import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

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
        List<Set<Integer>> keyToIndexList = new ArrayList<>('Z' - 'A' + 1);
        for (int i = charToIndex('A'); i <= charToIndex('Z'); i++) {
            keyToIndexList.add(new HashSet<Integer>());
        }

        for (int i = 0; i < s.length; i++) {
            keyToIndexList.get(charToIndex(s[i])).add(i);
        }

        int[] golems = new int[n];
        Arrays.fill(golems, 1);
        int remain = n;
        for (int i = 0; i < q; i++) {
            char t = sc.next().charAt(0);
            char d = sc.next().charAt(0);

            Set<Integer> indexList = keyToIndexList.get(charToIndex(t));
            int[] tmpArray = Arrays.copyOf(golems, n);
            for (Integer index : indexList) {
                if (index == 0 && d == 'L') {
                    remain -= golems[0];
                    golems[0] = 0;
                } else if (index == n - 1 && d == 'R') {
                    remain -= golems[n - 1];
                    golems[n - 1] = 0;
                } else {
                    golems[index] = 0;
                }
            }

            for (Integer index : indexList) {
                if (d == 'L' && index != 0) {
                    golems[index - 1] += tmpArray[index];
                } else if (d == 'R' && index != n - 1) {
                    golems[index + 1] += tmpArray[index];
                }
            }
        }

        System.out.println(remain);
    }

    int charToIndex(char c) {
        return c - 'A';
    }
}