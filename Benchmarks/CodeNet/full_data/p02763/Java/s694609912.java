import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        String S = scan.next();
        char[] d = S.toCharArray();
        BIT[] bits = new BIT[26];
        for (int i = 0; i < 26; i++) {
            bits[i] = new BIT(d.length);
        }
        for (int i = 0; i < d.length; i++) {
            bits[(int) d[i]-'a'].add(i + 1, 1);
        }
        int Q = scan.nextInt();
        for (int i = 0; i < Q; i++) {
            int type = scan.nextInt();
            if (type == 1) {
                int index = scan.nextInt()-1;
                char old_c = d[index];
                char new_c = scan.next().toCharArray()[0];
                if (old_c == new_c) {
                    continue;
                }
                bits[(int)old_c-'a'].add(index+1, -1);
                bits[(int)new_c-'a'].add(index+1, 1);
                d[index] = new_c;
                continue;
            }
            int l = scan.nextInt();
            int r = scan.nextInt();
            int ans = 0;
            for (int j = 0; j < 26; j++) {
                if (0 < bits[j].sum(r)-bits[j].sum(l-1)) {
                    ans += 1;
                }
            }
            System.out.println(ans);
        }
    }
    class BIT {
        int size;
        int[] data;
        BIT(int N) {
            int size = 1;
            while (size < N) {
                size *= 2;
            }
            int[] data = new int[size * 2];
            Arrays.fill(data, 0);
            this.size = size;
            this.data = data;
        }
        void add(int k, int a) {
            while (k <= this.size) {
                this.data[k] += a;
                k += (k & -k);
            }
        }
        int sum(int i) {
            int sum = 0;
            while (0 < i) {
                sum += this.data[i];
                i -= (i & -i);
            }
            return sum;
        }
    }
}
