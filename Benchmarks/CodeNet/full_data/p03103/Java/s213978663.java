import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<D> l = new ArrayList<>();
        for(int i=0; i<n; i++) {
            long p = sc.nextLong();
            int num = sc.nextInt();
            l.add(new D(num, p));
        }
        Collections.sort(l);
        long res = 0;
        for(D d : l) {
            if(m > d.num) {
                res += d.num * d.p;
                m -= d.num;
            } else {
                res += m * d.p;
                break;
            }
        }
        System.out.println(res);

    }

    static class D implements Comparable<D> {
        int num;
        long p;
        D(int num, long p) {
            this.num = num;
            this.p = p;
        }

        @Override public int compareTo(D o) {
            if(p<o.p) return -1;
            if(p>o.p) return 1;
            return 0;
        }
    }
}
