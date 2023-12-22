import java.util.*;
import java.lang.*;
import java.io.IOException;

public class Main{
	static Tree tree;
	static boolean[] visited;
	public static void main(String[] args) {
		int n = nextInt();
		int q = nextInt();
		tree = new Tree(n);
		for (int i = 0; i < n - 1; i++) {
			tree.union(nextInt() - 1, nextInt() - 1);
		}
		for (int i = 0; i < q; i++) {
			tree.node[nextInt() - 1].value += nextInt();
		}
		visited = new boolean[n];
		visited[0] = true;
		dfs(0);
		for (int i = 0; i < n - 1; i++) {
			System.out.print(tree.node[i].value + " ");
		}
		System.out.println(tree.node[n - 1].value);
	}
	static void dfs(int n) {
		visited[n] = true;
		for (int key : tree.node[n].list) {
			if (!visited[key]) {
				visited[key] = true;
				tree.node[key].value += tree.node[n].value;
				dfs(key);
			}
		}
	}
  
    static int nextInt() {
        int c;
        try {
            c = System.in.read();
            while(c != '-' && (c < '0' || c > '9')) c = System.in.read();
            if(c == '-') return -nextInt();
            int res = 0;
            while(c >= '0' && c <= '9') {
                res = res * 10 + c - '0';
                c = System.in.read();
            }
            return res;
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return -1;
    }
}

class Node {
	ArrayList<Integer> list;
	int value;
	Node() {
		list = new ArrayList<>();
		value = 0;
	}
}

class Tree {
	Node[] node;
	Tree(int n) {
		node = new Node[n];
		for (int i = 0; i < n; i++) {
			node[i] = new Node();
		}
	}
	void union(int n, int m) {
		node[n].list.add(m);
		node[m].list.add(n);
	}
}
