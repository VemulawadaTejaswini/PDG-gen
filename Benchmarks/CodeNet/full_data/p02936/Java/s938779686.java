import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int N = scan.nextInt();
        int Q = scan.nextInt();
        Tree tree[] = new Tree[N + 1];
        for(int i = 0; i < N + 1; i++) {
            tree[i] = new Tree();
            tree[i].value = 0;
        }

        for(int i = 0; i < N-1; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            tree[a].tree.add(tree[b]);
        }

        for(int i = 0; i < Q; i++) {
            int p = scan.nextInt();
            int x = scan.nextInt();
            tree[p].value += x;
            tree[p].addValueToChildren(x);
        }

        for(int i = 0; i < N; i++) {
            os.print(tree[i+1].value);
            if(i+1 < N)
                os.print(" ");
            else
                os.println();
        }
    }
}

class Tree {
    int value = 0;
    List<Tree> tree = new ArrayList<>();

    public Tree(){}

    public void addValueToChildren(int x){
        for(Tree child : tree) {
            child.value += x;
            child.addValueToChildren(x);
        }
    }
}