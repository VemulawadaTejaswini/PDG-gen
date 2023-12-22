import java.util.*;

public class Main{
  static List<List<Integer>> list = new ArrayList<>(); 
  static int[] pt;

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int q = Integer.parseInt(sc.next());
    int a,b;
    pt = new int[n];
    
    for(int i=0;i<n;i++){
      list.add(i,new ArrayList());
      list.get(i).add(0,0);
      pt[i] = 0;
    }
    
    for(int i=0;i<n-1;i++){
      a = Integer.parseInt(sc.next());
      b = Integer.parseInt(sc.next());
      list.get(a-1).add(0,b);
    }
    //System.out.println(list);
    int cnt = 0, node, s, point;
    for(int i=0;i<q;i++){
      	s = Integer.parseInt(sc.next());
      	point = Integer.parseInt(sc.next());
      //System.out.println("s,point:"+s+","+point);
      	search(point,s);
      	pt[s-1] += point;
      	
    }
    for(int i=0;i<n;i++) System.out.print(pt[i] + " ");
  }
  public static void search(int point, int a){
    int node,j=0;
    while(true){
      
      if(list.get(a-1).size() < (j+1)) break;
      node = list.get(a-1).get(j);
      if(node == 0) break;
      //System.out.println(a +","+ j +","+ node);
      pt[node-1] += point;
      //System.out.println("pt["+(node-1)+"]="+pt[node-1]);
      j++;
  	  search(point, node);
   	}
  }
}
