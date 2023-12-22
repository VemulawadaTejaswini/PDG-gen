import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        if(n <= k) {
            System.out.println(0);
            return;
        }
        Collections.sort(a);
        for (int i = 0; i < k; i++) {
            a.remove(a.size() - 1);
        }
        long ans = 0l;
        for (Integer i : a) {
            ans += i;
        }
        System.out.println(ans);
    }
}