import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Main {
    public static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

    public static int nextInt() {
        try {
            in.nextToken();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return (int) in.nval;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int x = nextInt(), y = nextInt(), a = nextInt(), b = nextInt(), c = nextInt(), cnt1 = 0, cnt2 = 0, cnt3 = 0;
        int n = a + b + c;
        long ans = 0;
        M6 m[] = new M6[n];
        for (int i = 0; i < a; i++) {
            m[i] = new M6(nextInt(), 1);
        }
        for (int i = a; i < a + b; i++) {
            m[i] = new M6(nextInt(), 2);
        }
        for (int i = a + b; i < n; i++) {
            m[i] = new M6(nextInt(), 3);
        }
        Arrays.sort(m);
        for (int i = n - 1; i >= 0; i--) {
            int k = m[i].i;
            if (k == 3) {
                cnt3++;
                ans += m[i].v;
            } else if (k == 1 && cnt1 < x) {
                cnt1++;
                ans += m[i].v;
            } else if (k == 2 && cnt2 < y) {
                cnt2++;
                ans += m[i].v;
            }
            if (cnt3 + cnt2 + cnt1 == x + y)
                break;
        }
        System.out.println(ans);
    }

}

class M6 implements Comparable<M6> {
    int v;

    int i;

    public M6(int v, int i) {
        super();
        this.v = v;
        this.i = i;
    }

    @Override
    public int compareTo(M6 o) {
        // TODO Auto-generated method stub
        return this.v - o.v;
    }

}
