/**
 * @author Finn Lidbetter
 */
import java.util.*;
import java.io.*;
import java.awt.geom.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    String[] s = br.readLine().split(" ");
    int[] index = new int[n];
    for (int i=0; i<n; i++) {
      arr[i] = Integer.parseInt(s[i]);
      index[arr[i]-1] = i;
    }
    Node evenTree = new Node(0,n/2);
    Node oddTree = new Node(0,n/2);
    for (int i=0; i<n/2; i++) {
      evenTree.update(i,i+1,arr[2*i]);
      oddTree.update(i,i+1,arr[2*i+1]);
    }
    NodePair ans = solve(0,n, evenTree, oddTree, index);
    while (ans!=null) {
      sb.append(ans.p.x+" "+ans.p.y+" ");
      ans = ans.next;
    }
    sb.delete(sb.length()-1, sb.length());
    System.out.println(sb);
  }
  static NodePair solve(int lo, int hi, Node evenTree, Node oddTree, int[] index) {
    //System.out.println("Recursing on "+lo+","+hi);
    if (lo>=hi)
      return null;
    if (lo%2==0) {
      int x = evenTree.min(lo/2, lo/2+(hi-lo)/2);
      int y = oddTree.min(lo/2, lo/2+(hi-lo)/2);
      Pair p = new Pair(x,y);
      NodePair np = new NodePair(p);
      np = np.append(NodePair.combine(NodePair.combine(solve(lo, index[x-1], evenTree, oddTree, index), solve(index[x-1]+1,index[y-1], evenTree, oddTree, index)), solve(index[y-1]+1, hi, evenTree, oddTree, index)));
      return np;
    } else {
      int x = oddTree.min((lo-1)/2, (lo-1)/2+(hi-lo)/2);
      int y = evenTree.min((lo+1)/2, (lo+1)/2+(hi-lo)/2);
      Pair p = new Pair(x,y);
      NodePair np = new NodePair(p);
      np = np.append(NodePair.combine(NodePair.combine(solve(lo, index[x-1], evenTree, oddTree, index), solve(index[x-1]+1,index[y-1], evenTree, oddTree, index)), solve(index[y-1]+1, hi, evenTree, oddTree, index)));
      return np;
    }
  }
}
class NodePair {
  Pair p;
  NodePair next;
  NodePair prev;
  public NodePair(Pair pp) {
    p = pp;
  }
  public static NodePair combine(NodePair p1, NodePair p2) {
    if (p1==null)
      return p2;
    if (p2==null)
      return p1;
    NodePair head;
    NodePair c1 = p1;
    NodePair c2 = p2;
    if (p1.p.compareTo(p2.p)<0) {
      head = p1;
      c1 = p1.next;
    } else {
      head = p2;
      c2 = p2.next;
    }
    NodePair curr = head;
    while (c1!=null && c2!=null) {
      if (c1.p.compareTo(c2.p)<0) {
        curr.next = c1;
        c1.prev = curr;
        c1 = c1.next;
        curr = curr.next;
      } else {
        curr.next = c2;
        c2.prev = curr;
        c2 = c2.next;
        curr = curr.next;
      }
    }
    while (c1!=null) {
      curr.next = c1;
      c1.prev = curr;
      c1 = c1.next;
      curr = curr.next;
    }
    while(c2!=null) {
      curr.next = c2;
      c2.prev = curr;
      c2 = c2.next;
      curr = curr.next;
    }
    return head;
  }
  public NodePair append(NodePair p) {
    NodePair head = this;
    NodePair curr = this;
    if (p==null)
      return head;
    while (curr.next!=null) {
      curr = curr.next;
    }
    p.prev = curr;
    curr.next = p;
    return head;
  }
}
class Pair implements Comparable<Pair> {
  int x,y;
  public Pair(int xx, int yy){
    x = xx;
    y = yy;
  }
  public int compareTo(Pair p2) {
    if (x==p2.x)
      return y-p2.y;
    return x-p2.x;
  } 
}
class Node {
  static final int INF = Integer.MAX_VALUE;
  int minPos, maxPos, min, lazy = 0;
  Node left, right;
  public Node(int l, int r) {
    minPos = l; maxPos = r;
    if (l == r - 1) left = right = null;
    else {
      int mid = (l + r) / 2;
      left = new Node(l, mid);
      right = new Node(mid, r);
    } 
	}
	public void update(int l, int r, int change) { // Adjust [l, r)
    propagate(); // Do lazy updates to children
    if (l <= minPos && maxPos <= r) { // Node's range fits in query range
      min += change;
      // Lazily propagate update to children
      if (left != null) left.lazy += change;
      if (right != null) right.lazy += change;
    } else if (!(r <= minPos || l >= maxPos)) { // Partial overlap
      if (left != null) left.update(l, r, change);
      if (right != null) right.update(l, r, change);
      min = Math.min(
        (left == null ? INF : left.min),
        (right == null ? INF : right.min)); 
    } 
  }
  public void propagate() {
    if (lazy != 0) {
      min += lazy;
      if (left != null) left.lazy += lazy;
      if (right != null) right.lazy += lazy;
      lazy = 0;
    } 
  }
	public int min(int l, int r) { // Get min value in interval [l, r)
    propagate();
		if (l <= minPos && maxPos <= r) 
			return min;
    else if (r <= minPos || l >= maxPos) 
			return INF;
    else 
			return Math.min((left == null ? INF : left.min(l, r)),
      (right == null ? INF : right.min(l, r))); 
	}
}
