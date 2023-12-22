import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.HashMap;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
*/public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		Scanner in = new Scanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskD solver = new TaskD();
		solver.solve(1, in, out);
		out.close();
	}
static class TaskD   {
public void solve(int testNumber, Scanner in, PrintWriter out) {
        String S = in.next();
        String T = in.next();
        String ans = "Yes";
        UnionFind uf = new UnionFind(S.length());
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i < S.length(); i++){
            char st = S.charAt(i);
            if(!hm.containsKey(st)) hm.put(st, i);
            else uf.union(i, hm.get(st));
        }
        HashMap<Character, Integer> hm2 = new HashMap<>();
        for(int i = 0; i < T.length(); i++){
            char st = T.charAt(i);
            if(!hm2.containsKey(st)) hm2.put(st, i);
            else if(!uf.same(i, hm2.get(st))) ans = "No";
        }
        out.println(ans);

    }

class UnionFind   {
int[] par;
int[] size;
int g;

UnionFind(int youso) {
            this.g = youso;
            this.par = new int[youso];
            this.size = new int[youso];
            for(int i=0; i<=g-1; i++){
                par[i] = i;
            }
            for(int i=0; i<=g-1; i++){
                size[i] = 1;
            }
        }

int find(int node) {
            if(par[node]==node){
                return node;
            }
            return par[node] = find(par[node]);
        }

void union(int node1, int node2) {
            int root1 = find(node1);
            int root2 = find(node2);
            if(root1 == root2){
                return;
            }
            g--;
            if(size[root1] < size[root2]){
                int temp = root1;
                root1 = root2;
                root2 = temp;
            }
            size[root1] += size[root2];
            par[root2] = root1;
        }

boolean same(int node1, int node2) {
            return find(node1) == find(node2);
        }

}

}
}

