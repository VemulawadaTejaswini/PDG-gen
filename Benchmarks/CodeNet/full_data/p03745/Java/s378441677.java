

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            if (a[i + 1] - a[i] > 0) {
                list.add(1);
            } else if (a[i + 1] == a[i]) {
            } else {
                list.add(-1);
            }
        }

        int count = 0;
        int p = 0;
        for (int i = 0; i < list.size(); i++) {
            if (p == 0) {
                p = list.get(i);
            }else
            if (p == 1) {
                if (list.get(i) == -1) {
                    count++;
                    p = 0;
                }
            } else {
                if (p == -1) {
                    count++;
                    p = 0;
                }
            }
        }

        System.out.println(count + 1);
    }

}
