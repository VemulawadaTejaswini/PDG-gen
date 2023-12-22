import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }

        Collections.sort(a);
        for (int i = 0; i < m; i++) {
            a.set(a.size() -1, a.get(a.size() -1) / 2);
            Collections.sort(a);
        }

        long result = 0;
        for (int amount : a){
            result += amount;
        }

        System.out.println(result);
    }
}
