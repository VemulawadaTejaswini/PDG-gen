

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    int n = sc.nextInt();
    int[] arr = new int[n+1];
    for(int i = 1; i <= n; i++) {
      arr[i] = sc.nextInt();
    }
    ArrayList<Integer> ans = new ArrayList();
    Queue<Integer> qu = new LinkedList();
    ans.add(1);
    int last = 1;
    for(int i = 2; i <= n; i++) {
      while(!qu.isEmpty()) {
        int now = qu.peek();
        if(arr[last]!=now) {
          ans.add(now);
          last = now;
          qu.poll();
        } else {
          break;
        }
      }
      if(arr[last]!=i) {
        ans.add(i);
        last = i;
      } else {
        qu.add(i);
      }
    }
    if(qu.size()>0) {
      out.println(-1);
    } else {
      for(Integer i : ans) {
        out.print(i + " ");
      }
      out.println();
    }
    out.close();
  }

}
