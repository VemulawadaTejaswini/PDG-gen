

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    static class Obj {
        public Obj(int i, int num, int bonus) {
            this.i = i;
            this.num = num;
            this.bonus = bonus;
        }

        int i;
        int num;
        int bonus;
    }

    public static void main(String[] args) {
        int d = sc.nextInt();
        int g = sc.nextInt();

        PriorityQueue<Obj> pq = new PriorityQueue(d, new MyComparator());
        PriorityQueue<Obj> pq2 = new PriorityQueue(d, new MyComparator2());
        for (int i = 0; i < d; i++) {
            int dnum = sc.nextInt();
            int dbonus = sc.nextInt();
            pq.add(new Obj(i + 1, dnum, dbonus));
            pq2.add(new Obj(i + 1, dnum, dbonus));
        }
        int count = solve(g, pq);
        int count2 = solve(g, pq2);
        System.out.println(Math.min(count, count2));
    }

    private static int solve(int g, PriorityQueue<Obj> pq) {
        long result = 0;
        int count = 0;
        while (result < g) {
            Obj obj = pq.poll();
            if ((obj.i * 100 * obj.num) > (g - result)) {
                double temp = ((double) g - result) / (obj.i * 100);
                count += Math.ceil(temp);
                break;
            }
            result += obj.i * 100 * obj.num + obj.bonus;
            count += obj.num;
        }
        return count;
    }

    private static class MyComparator implements java.util.Comparator<Obj> {


        @Override
        public int compare(Obj o1, Obj o2) {
            if (o1.i < o2.i) {
                return 1;
            } else if (o1.i > o2.i) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    private static class MyComparator2 implements java.util.Comparator<Obj> {
        @Override
        public int compare(Obj o1, Obj o2) {
            if (o1.num < o2.num) {
                return -1;
            } else if (o1.num > o2.num) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
