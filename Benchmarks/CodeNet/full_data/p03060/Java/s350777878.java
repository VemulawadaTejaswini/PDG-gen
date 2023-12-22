import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();

        int[] v = new int[n];
        int[] c = new int[n];

        for (int i=0; i < n; i++)
            v[i] = sc.nextInt();
        for (int i=0; i < n; i++)
            c[i] = sc.nextInt();

        List<Integer> d = new ArrayList<>();

        for (int i=0; i < n; i++)
            d.add(v[i] - c[i]);

        Collections.sort(d, (o1, o2) -> o2 - o1);

        int max = 0;

        for (int i=0; i < d.size(); i++) {
            if (d.get(i) > 0)
                max += d.get(i);
            else
                break;
        }

        System.out.println(max);

    }

}
