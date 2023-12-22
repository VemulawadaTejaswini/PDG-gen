import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long k = scan.nextLong();
 
        Pair[] p = new Pair[(int) n];
        for (int i = 0; i < n; i++) {
            p[i] = new Pair(scan.nextLong(), scan.nextLong());
        }
        Arrays.sort(p);
        long place = 0;
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
    long times, num;
 
    public Pair(long a, long b) {
        num = a;
        times = b;
    }
    @Override
    public int compareTo(Pair o) {
        return (int)(this.num - o.num);
    }
}