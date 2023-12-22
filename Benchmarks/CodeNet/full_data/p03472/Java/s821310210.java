import java.io.PrintWriter;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int h = sc.nextInt();
        int[][] arr = new int[n][2];
        for (int i=0; i<n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        int aMax = 0;

        int ans = 0;

        for (int i=0; i<n; i++) {
            aMax = Math.max(aMax, arr[i][0]);
        }

//        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        Data[] d = new Data[n];

        for (int i=0; i<n; i++) {
            d[i] = new Data(arr[i][0], arr[i][1]);
        }

        Arrays.sort(d);

//        out.println(arr[2][1]);
//        out.println(aMax);

        label:
        for (int i=0; i<n; i++) {
            if (arr[i][1]>aMax) {
                h -= arr[i][1];
                ans++;
                if (h<=0) break label;
            }
        }

        if (h<=0) {
            out.print(ans);
            out.flush();
        } else {
            ans += (h+aMax-1)/aMax;

            out.print(ans);
            out.flush();

        }

    }

    public class Data implements Comparable<Data> {
        int a, b;

        public Data(int a, int b) {
            this.a = a;
            this.b = b;
        }
        public int compareTo(Data other) {
            if (this.b==other.b) {
                return this.b - other.b;
            } else {
                return other.a- this.a;
            }
        }

    }

}
