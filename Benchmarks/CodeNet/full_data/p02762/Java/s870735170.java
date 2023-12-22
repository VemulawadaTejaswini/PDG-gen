
import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static class Root {
        int root;
        Set<Integer> friends;
        Root (int root) {
            this.root = root;
            this.friends = new HashSet<>();
            this.friends.add(root);
        }
    }

    static Root find(int i) {
        if(roots[i].root == i) {
            return roots[i];
        }
        roots[i].root = roots[roots[i].root].root;
        return find(roots[i].root);
    }

    static void union(Root a, Root b) {
        if(a.root == b.root) return;
        if(a.friends.size() < b.friends.size()){
            a.root = b.root;
            b.friends.addAll(a.friends);
        } else {
            b.root = a.root;
            a.friends.addAll(b.friends);
        }
    }

    static Root[] roots;

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int K = scan.nextInt();
        roots = new Root[N];
        int[] friends = new int[N];
        int[] blocks = new int[N];
        for(int i = 0; i < N; i++) {
            roots[i] = new Root(i);
        }

        for(int i = 0; i < M; i++) {
            int A = scan.nextInt()-1;
            int B = scan.nextInt()-1;
            friends[A]++;
            friends[B]++;
            Root rootA = find(A);
            Root rootB = find(B);
            union(rootA, rootB);
        }

        for(int i = 0; i < K; i++) {
            int C = scan.nextInt()-1;
            int D = scan.nextInt()-1;
            Root rootC = find(roots[C].root);
            Root rootD = find(roots[D].root);
            if(rootC.root == rootD.root) {
                blocks[C]++;
                blocks[D]++;
            }
        }

        for(int i = 0; i < N; i++) {
            Root root = find(i);
            int possible = root.friends.size() - friends[i] - blocks[i] - 1;
            os.print(possible);
            if(i != N-1)
                os.print(" ");
        }
        os.println();
    }
}