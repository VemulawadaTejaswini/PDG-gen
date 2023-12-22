import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
  
public class Main {
	static class Graph {
      	Stack mStack = new Stack();
        int mVertices;
      	ArrayList<ArrayList<Integer>> mEdges = new ArrayList<ArrayList<Integer>>();
      
      	Graph(int n) {
          mVertices = n;
          for (int i = 0; i < n; i++) {
          	mEdges.add(new ArrayList<Integer>());
          }
        }
      
      	void add(int a, int b) {
          mEdges.get(a - 1).add(b - 1); 
        }
      
      	boolean iSCyclic() {
          boolean[] visited = new boolean[mVertices];
          //do DFS from each node
          for (int i = 0; i < mVertices; i++) {
          	if (isCyclicHelper(i, visited, mStack))
              return true;
          }
          return false;
        }
      
      	boolean isCyclicHelper(int a, boolean[] visited, Stack stack) {
          visited[a] = true;
          stack.push(a);
          
          for (Integer b: mEdges.get(a)) {
            if (!visited[b] && isCyclicHelper(b, visited, stack))
              return true;
            else if(stack.contains(b))
              return true;
          }
          
          stack.pop();
          return false;
        }
      
      	void printResult() {
          //Object[] vals = mStack.toArray();
          System.out.println(mStack.size());
          while (!mStack.isEmpty()) {
              System.out.println((Integer)mStack.pop() + 1);
          }
          //System.out.println(Arrays.toString(mStack.toArray()));
        }
      }

    public static void main(String[] args) {
       
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      int m = scanner.nextInt();
      
      Graph g = new Graph(n);
      for (int i = 0; i < m; i++) {
      	int a = scanner.nextInt();
      	int b = scanner.nextInt();
        g.add(a, b);
      }
      g.iSCyclic();
      g.printResult();
    }
  
}
