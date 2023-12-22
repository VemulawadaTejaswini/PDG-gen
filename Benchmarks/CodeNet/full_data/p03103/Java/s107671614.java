

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{

    public static class store implements Comparable<store> {

        long A, B;

        public store(long a, long b) {
            A = a;
            B = b;
        }

        public int compareTo(store o) {
            if (this.A > o.A) {
                return 1;
            } else if (this.A < o.A) {
                return -1;
            } else {
                return 0;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long N = Long.parseLong(st.nextToken());
        long  M = Long.parseLong(st.nextToken());
        store[] stores = new store[(int)N];
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            stores[i] = new store(Long.parseLong(st.nextToken()), Long.parseLong(st.nextToken()));
        }
        Arrays.sort(stores);
        long drinks = 0;
        long money = 0;
        for (int i=0; i<N; i++) {
            for (int j=0; j<stores[i].B; j++) {
                drinks++;
                money+=stores[i].A;
                if (drinks==M) {
                    System.out.println(money);
                    return;
                }
            }
        }
    }
}


















