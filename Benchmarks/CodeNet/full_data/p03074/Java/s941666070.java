
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();

        int[] a  = new int[n];
        for (int i = 0 ; i < n ;i++) {
            a[i] = s.charAt(i) - 48;
        }

        List<Integer> list0 = new ArrayList<>(); // 0
        List<Integer> list1 = new ArrayList<>(); // 1
        int init = a[0];
        int cnt = 1;
        for (int i = 1 ; i < n ; i++) {
            if (a[i] == init) {
                cnt++;
            } else {
                if (init == 0) {
                    list0.add(cnt);
                } else {
                    list1.add(cnt);
                }
                init = a[i];
                cnt = 1;
            }
        }
        if (init == 0) {
            list0.add(cnt);
        } else {
            list1.add(cnt);
        }
        int [] a0 = new int[list0.size()];
        int[] a1 = new int[list1.size()];

        for (int i = 0 ; i < a0.length ; i++) {
            a0[i] = list0.get(i);
        }
        for (int i = 0 ; i < a1.length ; i++) {
            a1[i] = list1.get(i);
        }

        if (list0.size() <= k ) {
            System.out.println(n);
            return;
        }
        List<Integer> list = new ArrayList<>();

            list.add(0);


        for (int i = 0 ; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                list.add(i + 1);
            }
        }
        list.add(n);
        int max = 0;
        for (int i = 0 ; i < n ; i++) {
            if (2 * k +  2 * i  + 1< list.size()) {
                int can = list.get(2 * k + 2 *  i + 1) - list.get(2 * i);
                max = Math.max(max, can);
            }
        }

        System.out.println(max);




    }


}