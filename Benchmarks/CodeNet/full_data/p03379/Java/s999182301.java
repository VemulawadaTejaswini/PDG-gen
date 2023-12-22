
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> xx = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            x.add(tmp);
            xx.add(tmp);
        }
        Collections.sort(xx);
        int r = xx.get(n / 2 - 1);
        int l = xx.get(n / 2);
        for (int i = 0; i < n; i++) {
            int ans = 0;
            int tmp = x.get(i);
            if(tmp <= r) {
                ans = l;
            } else {
                ans = r;
            }
            System.out.println(ans);
        }
    }
}