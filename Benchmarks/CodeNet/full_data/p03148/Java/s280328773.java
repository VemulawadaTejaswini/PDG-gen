import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        SUSHI[] sushi = new SUSHI[n];
        for (int i = 0; i < n; i++) {
            sushi[i] = new SUSHI(sc.nextInt() - 1, sc.nextLong());
        }
        Arrays.sort(sushi);

        long ans = 0, sumOfDelicious = 0;
        boolean[] used = new boolean[n];
        PriorityQueue<SUSHI> queue = new PriorityQueue<>();
        int kind = 0;

        for(int i = 0; i < n; i++) {
            SUSHI s = sushi[i];
            if(i < k) {
                sumOfDelicious += s.delicious;
                if(used[s.type]) {
                    queue.offer(s);
                } else {
                    kind++;
                    used[s.type] = true;
                }
                ans = Math.max(ans, sumOfDelicious + kind * kind);
            } else if(!queue.isEmpty() && !used[s.type]) {
                sumOfDelicious -= queue.poll().delicious;
                sumOfDelicious += s.delicious;
                used[s.type] = true;
                kind++;
                ans = Math.max(ans, sumOfDelicious + kind * kind);
            }
        }
        System.out.println(ans);
    }
}

class SUSHI implements Comparable<SUSHI> {
    int type;
    long delicious;

    SUSHI(int t, long d) {
        type = t;
        delicious = d;
    }

    @Override
    public int compareTo(SUSHI o) {
        return this.delicious == o.delicious
                ? Integer.compare(this.type, o.type)
                : Long.compare(o.delicious, this.delicious);
    }
}