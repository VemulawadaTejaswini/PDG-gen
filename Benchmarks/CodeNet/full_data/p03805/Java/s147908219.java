package atcoder.beginnercontest.abc054.c;

import org.junit.Test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static int n;
    static boolean[][] connected;

    static public int countPattern(int pos, Set<Integer> visited) {
        if (visited.size() == n) return 1;

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (connected[pos][i] && !visited.contains(i)) {
                visited.add(i);
                count += countPattern(i, visited);
                visited.remove(i);
            }
        }
        return count;
    }

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();

        connected = new boolean[n][n];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;

            connected[a][b] = true;
            connected[b][a] = true;
        }

        Set<Integer> visited = new HashSet<>();
        visited.add(0);
        int count = countPattern(0, visited);
        System.out.println(count);
    }

    @Test
    public void test() {
        Main m = new Main();
    }
}