import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> ln = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++) {
            ln.add(sc.nextInt());
        }

        Collections.sort(ln);
        int s = 0;
        for (int i = n-k; i < n; i++) {
            s += ln.get(i);
        }

        System.out.println(s);
    }

}
