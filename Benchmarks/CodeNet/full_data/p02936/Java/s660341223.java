import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		Tree[] trees = new Tree[n + 1];
		for (int i = 1; i <= n; i++) {
		    trees[i] = new Tree(i);
		}
		for (int i = 0; i < n - 1; i++) {
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    trees[a].children.add(trees[b]);
		    trees[b].children.add(trees[a]);
		}
		for (int i = 0; i < q; i++) {
		    trees[sc.nextInt()].value += sc.nextInt();
		}
		trees[1].setValue(0, 0);
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
		    if (i != 1) {
		        sb.append(" ");
		    }
		    sb.append(trees[i].value);
		}
		System.out.println(sb);
   }
   
   static class Tree {
       int idx;
       ArrayList<Tree> children = new ArrayList<>();
       int value = 0;
       
       public Tree (int idx) {
           this.idx = idx;
       }
       
       public void setValue(int parent, int value) {
           this.value += value;
           for (Tree t: children) {
               if (t.idx != parent) {
                   t.setValue(idx, this.value);
               }
           }
       }
   }
}


