import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<P> a = new ArrayList<>();

        for(int i=0; i<n; i++) {
            a.add(new P(sc.nextLong(), sc.nextLong()));
        }
        Collections.sort(a);

        long res = 0;

        for(int i=0; i<n; i++) {
            if(i % 2 == 0) {
                res += a.get(i).a;
            } else {
                res -= a.get(i).b;
            }
        }

        System.out.println(res);
    }

    public static class P implements Comparable<P>{
        long a;
        long b;
        public P(long a, long b) {
            this.a = a;
            this.b = b;
        }
        @Override public int compareTo(P o) {
            long diff =  o.a + o.b - (a+b);
            if(diff > 0) return 1;
            if(diff < 0) return -1;
            return 0;
        }
    }

}
