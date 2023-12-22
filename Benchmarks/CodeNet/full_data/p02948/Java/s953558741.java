import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        //それぞれの仕事でここまでにうけーてええでという基準日がある
        //その基準日を求めてそのなかの最大パｆｐのを渡す。かんじ・
        //かつおしりからつめていく
//        int[] c = new int[n];
//        for (int i = 0; i < n; i++) {
//            c[i] = m - a[i];
//        }
        List<Pair> list = new ArrayList<>();
        for (int i = 0 ; i < n ; i++) {
            Pair p = new Pair();
            p.from = a[i];
            p.end = b[i];
            list.add(p);
        }
        Collections.sort(list);

        int ans = 0;
        Queue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());

        int index = 0;
        for (int i = 0 ; i <= m ; i++) {
            while (index < n &&  list.get(index).from <= i) {
                que.add(list.get(index).end);
                index++;
            }
            if (!que.isEmpty()) {
                ans += que.poll();
            }

        }

        System.out.println(ans);

    }

}


class Pair implements Comparable {
    int from;
    int end;


    @Override
    public int compareTo(Object other) {
        Pair otherpair = (Pair) other;
        int d = from - otherpair.from;
        if (d == 0) {
            return otherpair.end - end;
        } else {
            return d;
        }
    }

}