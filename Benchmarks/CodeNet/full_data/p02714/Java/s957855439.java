import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner sc = new Scanner(is);
        int N = sc.nextInt();
        String S = sc.next();
        int R[] = new int[N];
        int G[] = new int[N];
        int B[] = new int[N];

        for (int i = N-2; i >= 0; i--) {
            R[i] = R[i+1] + (S.charAt(i+1) == 'R' ? 1 : 0);
            G[i] = G[i+1] + (S.charAt(i+1) == 'G' ? 1 : 0);
            B[i] = B[i+1] + (S.charAt(i+1) == 'B' ? 1 : 0);
        }

        long ans = 0;
        for(int i = 0; i < N; i++) {
            for(int j = i+1; j < N; j++) {
                char firstC = S.charAt(i);
                char secondC = S.charAt(j);
                if(firstC == secondC) continue;

                if((firstC == 'R' && secondC == 'B') || firstC == 'B' && secondC == 'R') {
                    ans += G[j];
                    if(2*j-i < N && S.charAt(2*j-i) == 'G')
                        ans--;
                }
                if((firstC == 'R' && secondC == 'G') || firstC == 'G' && secondC == 'R') {
                    ans += B[j];
                    if(2*j-i < N && S.charAt(2*j-i) == 'B')
                        ans--;
                }
                if((firstC == 'G' && secondC == 'B') || firstC == 'B' && secondC == 'G') {
                    ans += R[j];
                    if(2*j-i < N && S.charAt(2*j-i) == 'R')
                        ans--;
                }
            }
        }

        os.println(ans);

    }
}