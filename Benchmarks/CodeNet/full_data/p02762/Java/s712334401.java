
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
        a.root = roots[b.root].root;
        roots[b.root].friends.addAll(a.friends);
    }

    static Root[] roots;

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int K = scan.nextInt();
        roots = new Root[N];
        int[] frineds = new int[N];
        Set<Integer>[] blocks = new Set[N];
        for(int i = 0; i < N; i++) {
            roots[i] = new Root(i);
            blocks[i] = new HashSet();
        }

        for(int i = 0; i < M; i++) {
            int A = scan.nextInt()-1;
            int B = scan.nextInt()-1;
            frineds[A]++;
            frineds[B]++;
            Root rootA = find(A);
            Root rootB = find(B);
            union(rootA, rootB);
        }

        for(int i = 0; i < K; i++) {
            int C = scan.nextInt()-1;
            int D = scan.nextInt()-1;
            blocks[C].add(D);
            blocks[D].add(C);
        }

        for(int i = 0; i < N; i++) {
            Root root = find(i);
            int possible = root.friends.size() - frineds[i] - 1;
            int blockNum = 0;
            for(Integer block: blocks[i]) {
                if(root.friends.contains(block))
                    blockNum++;
            }
            os.print((possible-blockNum));
            if(i != N-1)
                os.print(" ");
        }
        os.println();
    }
}