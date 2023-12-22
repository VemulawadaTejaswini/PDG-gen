import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int N = scan.nextInt();
        int a[] = new int[N];
        int b[] = new int[N];
        Tree trees[] = new Tree[N];
        int maxSides = 0;
        for (int i = 0; i < N; i++) {
            trees[i] = new Tree();
            Arrays.fill(trees[i].used, false);
        }

        for (int i = 0; i < N-1; i++) {
            a[i] = scan.nextInt() - 1;
            b[i] = scan.nextInt() - 1;
            trees[a[i]].allSides++;
            trees[b[i]].allSides++;
            if (maxSides < trees[a[i]].allSides)
                maxSides = trees[a[i]].allSides;
            if (maxSides < trees[b[i]].allSides)
                maxSides = trees[b[i]].allSides;
        }

        //K
        os.println(maxSides);

        for (int i = 0; i < N-1; i++) {
            int aSide = ++trees[a[i]].colored;
            int bSide = ++trees[b[i]].colored;
            int max = Math.max(aSide, bSide);
            max = max - 1;
            while(true) {
                if (trees[a[i]].used[max] == false && trees[b[i]].used[max] == false) {
                    trees[a[i]].used[max] = true;
                    trees[b[i]].used[max] = true;
                    os.println(max+1);
                    break;
                }
                max = ++max%(maxSides + 1);
                if(max == 0)
                    max = 1;
            }
        }
    }

    static class Tree {
        int colored = 0;
        int allSides = 0;
        boolean used[] = new boolean[100000];
    }
}