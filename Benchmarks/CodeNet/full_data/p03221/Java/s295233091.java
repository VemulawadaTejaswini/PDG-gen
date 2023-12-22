import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] p = new int[m];
        int[] y = new int[m];
        Map<Integer, Integer> yearTree = new TreeMap<>();

        for (int i = 0; i < m ; i++) {
            p[i] = sc.nextInt();
            y[i] = sc.nextInt();
            yearTree.put(y[i], p[i]);
        }
        int[] pCounter = new int[n];
        for (int yi : yearTree.keySet()) {
            yearTree.put(yi, ++pCounter[yearTree.get(yi) - 1]);
        }
        for (int i = 0; i < m; i++) {
            System.out.println(String.format("%d6%d6", p[i], yearTree.get(y[i])));
        }

    }
}
