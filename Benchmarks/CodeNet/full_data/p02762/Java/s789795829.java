import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static HashSet<Integer> friend[];
    static HashSet<Integer> block[];
    static HashSet<Integer> friendCache[];

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int K = scan.nextInt();
        friend = new HashSet[N];
        block = new HashSet[N];
        friendCache = new HashSet[N];
        for(int i = 0; i < N; i++) {
            friend[i] = new HashSet<>();
            block[i] = new HashSet<>();
        }

        for(int i = 0; i < M; i++) {
            int A = scan.nextInt()-1;
            int B = scan.nextInt()-1;
            friend[A].add(B);
            friend[B].add(A);
        }
        for(int i = 0; i < K; i++) {
            int C = scan.nextInt()-1;
            int D = scan.nextInt()-1;
            block[C].add(D);
            block[D].add(C);
        }

        int ans[] = new int[N];
        for(int i = 0; i < N; i++) {
            if(friend[i].size() + block[i].size() == N-1) {
                ans[i] = 0;
            } else {
                ans[i] = bfs(i);
            }
            os.print(ans[i]);
            if(i != N-1)
                os.print(" ");
        }
        os.println();

    }


    static int bfs(int i) {
        int ans = 0;
        HashSet<Integer> visited = new HashSet<>();
        HashSet<Integer> stack = new HashSet<>();
        visited.add(i);
        stack.addAll(friend[i]);
        while(!stack.isEmpty()) {
            HashSet<Integer> next = new HashSet<>();
            for(Integer fri : stack) {
                if(visited.contains(fri))
                    continue;
                visited.add(fri);
                if(friendCache[fri] != null)
                    next.addAll(friendCache[fri]);
                else
                    next.addAll(friend[fri]);
                if(!friend[i].contains(fri) && !block[i].contains(fri)) {
                    if(friendCache[i] == null) {
                        friendCache[i] = new HashSet<>();
                        friendCache[i].addAll(friend[i]);
                    }
                    friendCache[i].add(fri);
                    ans++;
                }
            }
            stack = next;
        }
        return ans;
    }
}