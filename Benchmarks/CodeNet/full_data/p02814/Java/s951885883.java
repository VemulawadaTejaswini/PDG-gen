import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    double[] a = new double[n];

    for (int i = 0; i < n; i++) {
        a[i] = (double) sc.nextInt();
    }

    List<Integer> possibilities = new LinkedList<Integer>();

    for (int i = 1; i <= m; i++) {
        possibilities.add(i);
    }

    for (int i = 0; i < a.length; i++) {
        List<Integer> newPossibilities = new LinkedList<Integer>();
        for (int j = 0; j < possibilities.size(); j++) {
            int possible = possibilities.get(j);
            if (possible * 10 / a[i] % 10 == 5) {
                newPossibilities.add(possible);
            }
        }
        possibilities = newPossibilities;
    }

    System.out.println(possibilities.size());
  }
}
