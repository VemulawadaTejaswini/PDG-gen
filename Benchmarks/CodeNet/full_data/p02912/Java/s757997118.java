
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        Collections.sort(a);
        // a = new LinkedList<>(a);
        for (int i = 0; i < m; i++) {
            Integer max = a.remove(n - 1);
            max /= 2;
            insertInto(a, max);
        }
        // int sum = a.stream().mapToInt(x -> x).sum();
        long sum = a.stream().mapToLong(x -> x).sum();
        System.out.println(sum);

        sc.close();
    }

    static void insertInto(List<Integer> a, Integer i) {
        a.add(i);
        Collections.sort(a);
    }

}
