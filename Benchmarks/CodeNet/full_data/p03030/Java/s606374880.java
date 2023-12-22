import java.util.Arrays;
import java.util.Scanner;

public class Main {

    class Store {
        int i;
        String s;
        int p;
        public Store(int i, String s, int p) {
            this.i = i;
            this.s = s;
            this.p = p;
        }

        @Override
        public String toString() {
            return this.i + " " + this.s + " " + this.p;
        }

    }
    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Store[] sArr = new Store[n];

        for (int i = 0; i < n; i++) {
            sArr[i] = new Store(i + 1, sc.next(), sc.nextInt());
        }

        Arrays.sort(sArr, (a,b)-> {

            boolean sBool = a.s.compareTo(b.s) <= 0;
            boolean pBool = a.p > b.p;
            return sBool && pBool ? -1 : 1;
        });

        for (int i = 0; i < n; i++) {
//            debug(sArr[i]);
            System.out.println(sArr[i].i);
        }
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
