import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.ConcurrentSkipListSet;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<>();

        ArrayList<Op> ops = new ArrayList<Op>();
        for(int i=0; i<n; i++) {
            int s = sc.nextInt();
            int t = sc.nextInt();
            int x = sc.nextInt();
            ops.add(new Op(0, x, s-x));
            ops.add(new Op(1, x, t-x));
        }

        for(int i=0; i<q; i++) {
            int d = sc.nextInt();
            ops.add(new Op(2, i, d));
        }

        Collections.sort(ops);

        for(Op op : ops) {
            switch(op.type) {
                case 0:
                    set.add(op.num);
                    break;
                case 1:
                    set.remove(op.num);
                    break;
                case 2:
                    if(set.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(set.first());
                    }
            }
        }

    }

    static class Op implements Comparable<Op>{
        int type;
        int num;
        int time;
        public Op(int type, int num, int time) {
            this.type = type;
            this.num = num;
            this.time = time;
        }
        @Override public int compareTo(Op o) {
            if(time == o.time) return 0;
            return time < o.time ? -1 : 1;
        }

    }

}
