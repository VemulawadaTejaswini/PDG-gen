import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        list.add(x);
        Collections.sort(list);
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list2.add(Math.abs(list.get(i + 1) - list.get(i)));
        }
        int ans = list2.get(0);
        for (int i = 1; i < list2.size() - 1; i++) {
            ans = gcd(ans, list2.get(i));
        }
        System.out.println(ans);
    }

    public static final int gcd(int a, int b) {
        if( b == 0 ) return a;
        return gcd(b, a % b);
    }
}