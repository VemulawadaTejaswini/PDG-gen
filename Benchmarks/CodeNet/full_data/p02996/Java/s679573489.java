import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        PriorityQueue<Task> queue = new PriorityQueue<>();
        PriorityQueue<Task> debug = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            queue.add(new Task(b[i], a[i], i));
            debug.add(new Task(b[i]-a[i], a[i], i));
        }

//        while (!debug.isEmpty()) {
//            Task t = debug.poll();
//            //System.err.println(t);
//            System.err.println("starttime:"+t.s);
//            System.err.println("length:"+t.l);
//        }

        long time = 0;
        while (!queue.isEmpty()) {
            //System.err.println("time:"+time);
            Task t = queue.poll();
            //System.err.println(t);
            if(time <= t.s-t.l) {
                time += t.l;
            } else {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}

class Task implements Comparable<Task> {
    long s, l, i;
    Task(long s, long l, int i) {
        this.s = s;
        this.l = l;
        this.i = i;
    }

    @Override
    public int compareTo(Task o) {
        return this.s != o.s ? Math.toIntExact(this.s - o.s)
                             : Math.toIntExact(this.l - o.l);
    }
    @Override
    public String toString() {
        return String.valueOf(this.i);
    }
}