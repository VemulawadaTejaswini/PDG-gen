

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> x = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            x.add(sc.nextInt());
        }
        ArrayList<Integer> xx = new ArrayList<>(x);
        Collections.sort(xx);

        for (int i = 0; i < n; i++) {
            int tmp = x.get(i);
            int tmp3 = xx.indexOf(Integer.valueOf(tmp));
            int tmp4 = 0;
            if(tmp3 <= (n - 1) / 2) {
                tmp4 = xx.get(((n - 1) / 2) + 1);
            } else if (tmp3 > (n - 1) / 2) {
                tmp4 = xx.get((n - 1) / 2);
            }
            System.out.println(tmp4);
        }

    }
}