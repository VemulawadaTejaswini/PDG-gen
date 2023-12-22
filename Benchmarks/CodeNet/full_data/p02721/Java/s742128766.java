import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int K = scan.nextInt();
        int C = scan.nextInt()+1;
        String S = scan.next();
        char[] d = S.toCharArray();
        int[] l = new int[K];
        int index = 0;
        int i = 0;
        while(i < N && index < K) {
            if (d[i] == 'o') {
                l[index++] = i;
                i += C;
                continue;
            }
            i += 1;
        }
        int[] r = new int[K];
        index = K - 1;
        i = N - 1;
        while(0 <= i && 0 <= index) {
            if (d[i] == 'o') {
                r[index--] = i;
                i -= C;
                continue;
            }
            i -= 1;
        }
        for (int j = 0; j < K; j++) {
            if (l[j] == r[j]) {
                System.out.println(l[j]+1);
            }
        }
    }
}
