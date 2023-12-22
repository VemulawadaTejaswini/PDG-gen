import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 1; i < m; i++) {
            list2.add(Math.abs(list.get(i -1) - list.get(i)));
        }
        if(list2.size() == 0) {
            System.out.println(0);
            return;
        }
        Collections.sort(list2);
        int ans = 0;
        for (int i = 0; i <= n; i++) {
            ans += list2.get(i);
        }
        System.out.println(ans);
    }
}