import java.util.Scanner;

public class Main {


    static int[] a = new int[31];

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] aa = {0,2,5,5,4,5,6,3,7,6};
        int a[] = new int[m];
        for(int i=0; i<m; i++) {
            a[i] = sc.nextInt();
        }
        Num[] memo = new Num[n+1];

        for(int i=0; i<m; i++) {
            int ni = aa[a[i]];
            if(ni>n) continue;
            if(memo[ni] == null ) {
                memo[ni] = new Num(a[i]);
            } else {
                if(new Num(a[i]).compareTo(memo[ni]) > 0) {
                    memo[ni] = new Num(a[i]);
                }
            }
        }
        for(int j=1; j<n; j++) {
            if(memo[j] == null) continue;
            for(int i=0; i<m; i++) {
                int ni = j + aa[a[i]];
                if(ni>n) continue;
                if(memo[ni] == null) {
                    memo[ni] = new Num(0);
                }
                Num num;
                num = new Num(memo[j].s + a[i]);
                if(num.compareTo(memo[ni]) > 0) {
                    memo[ni] = num;
                }
                num = new Num(a[i] + memo[j].s);
                if(num.compareTo(memo[ni]) > 0) {
                    memo[ni] = num;
                }
                num = new Num(memo[j].s.substring(0,1) + a[i] + memo[j].s.substring(1));
                if(num.compareTo(memo[ni]) > 0) {
                    memo[ni] = num;
                }
            }
        }

        System.out.println(memo[n].s);
    }

    static class Num implements Comparable<Num>{
        String s;
        public Num(String s) {
            this.s = s;
        }
        public Num(int n) {
            this.s = Integer.toString(n);
        }

        @Override public int compareTo(Num o) {
            if(s.length() != o.s.length()) {
                return s.length() - o.s.length();
            }
            return s.compareTo(o.s);
        }
    }


}
