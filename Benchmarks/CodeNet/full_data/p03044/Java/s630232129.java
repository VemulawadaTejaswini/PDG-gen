import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.ArrayDeque;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    List<List<Integer>> tree = new ArrayList<>();
    Map<Map<Integer,Integer>,Integer> edge = new HashMap<>();
    Integer u,v,w;
    Map<Integer,Integer> tmpmap;
    int[] colors = new int[n];
    boolean[] isChecked = new boolean[n];
    Queue<Integer> queue = new ArrayDeque<>();
    Queue<Integer> colqueue = new ArrayDeque<>();
    for(int i=0;i<n;i++){
      tree.add(new ArrayList<>());
    }
    for(int i=0;i<n-1;i++){
      u = Integer.parseInt(sc.next())-1;
      v = Integer.parseInt(sc.next())-1;
      w = Integer.parseInt(sc.next());
      
      tree.get(u).add(v);
      tree.get(v).add(u);
      tmpmap = new HashMap<>();
      tmpmap.put(u,v);
      edge.put(tmpmap,w);
      tmpmap = new HashMap<>();
      tmpmap.put(v,u);
      edge.put(tmpmap,w);
    }
    colors[0] = 0;
    queue.add(0);
    colqueue.add(0);
    isChecked[0] = true;
    Integer node , color;
    while(!queue.isEmpty()){
      node = queue.poll();
      color = colqueue.poll();
      if(tree.get(node)==null)continue;//つぎのノードがない
      
      for(Integer i : tree.get(node)){
        if(isChecked[i])continue;
        tmpmap = new HashMap<>();
        tmpmap.put(node,i);
        if((edge.get(tmpmap)&1)==0){//偶数なら
          colors[i] = color;
          colqueue.add(color);//同じ色
        }else{
          colors[i] = 1-color;
          colqueue.add(1-color);
        }
        queue.add(i);
        isChecked[i] = true;
      }
    }
    for(int ans : colors){
      System.out.println(ans);
    }
    System.out.flush();
  }
}