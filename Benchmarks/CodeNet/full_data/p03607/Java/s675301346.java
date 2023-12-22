
//18:48

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int ans = 0;
        List<Integer> b = new LinkedList<Integer>();
        int tag = 0;
        for (int i = 0; i < n; i++) {
            if (tag != a[i]) {
                tag = a[i];
                ans++;
            } else {
                // 同じ場合
                tag = 0;
                ans--;
            }
        }
        System.out.println(ans);

    }
}