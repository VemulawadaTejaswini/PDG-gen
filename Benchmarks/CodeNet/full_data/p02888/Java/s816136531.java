import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = sc.nextInt();
        sc.nextLine();
        int[] L  = toArray(sc.nextLine());
        int res = 0;
        for (int i = 0; i < n; i++) {
            int a = L[i];
            for (int j = i+1; j < n; j++) {
                int b = L[j];
                for (int k = j+1; k < n; k++) {
                    int c = L[k];
                    if(a+b > c && a+c > b && b+c > a) res++;
                }
            }
        }
        System.out.println(res);
    }

    public static class Pair {
        int m1;
        int m2;

        public Pair(int m1, int m2) {
            this.m1 = m1;
            this.m2 = m2;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return m1 == pair.m1 &&
                    m2 == pair.m2;
        }

        @Override
        public int hashCode() {
            return Objects.hash(m1, m2);
        }
    }

    private static int[] toArray(String text) {
        String[] vars = text.split("\\s+");
        int[] res = new int[vars.length];
        for (int i = 0; i < vars.length; i++) {
            res[i] = Integer.valueOf(vars[i]);
        }
        return res;
    }
}
