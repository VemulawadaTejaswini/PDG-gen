import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();

        Pair[] p = new Pair[n];
        for (int i = 0; i < n; i++) {
            p[i] = new Pair(scan.nextInt(), scan.nextInt());
        }
        Arrays.sort(p);
        int place = 0;
        for (int i = 0; i < n; i++) {
            place += p[i].times;
            if (place >= k) {
                System.out.println(p[i].num);
                break;
            }
        }
    }
}

class Pair implements Comparable<Pair> {
    int times, num;

    public Pair(int a, int b) {
        num = a;
        times = b;
    }
    @Override
    public int compareTo(Pair o) {
        return this.num - o.num;
    }
}