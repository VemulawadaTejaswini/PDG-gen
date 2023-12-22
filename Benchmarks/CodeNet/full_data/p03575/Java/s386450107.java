import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    List<List<int[]>> graph = new ArrayList<>();
    int n = Integer.parseInt(sc.next());
    int m = Integer.parseInt(sc.next());
    int a,b;
    for(int i=0;i<n;i++)graph.add(new LinkedList<>());
    
    for(int i=0;i<m;i++){
      a = Integer.parseInt(sc.next())-1;
      b = Integer.parseInt(sc.next())-1;
      graph.get(a).add(new int[]{b,i});
      graph.get(b).add(new int[]{a,i});
    }
    boolean[] isVisited = new boolean[n];
    Queue<Integer> queue = new ArrayDeque<>();
    int res = 0;
    for(int i=0;i<m;i++){
      Arrays.fill(isVisited,false);
      queue.add(0);
      isVisited[0] = true;
      while(queue.size()> 0){
        
        int to = queue.poll();
        
        for(int[] nxt: graph.get(to)){
          if(nxt[1]==i || isVisited[nxt[0]])continue;
          isVisited[nxt[0]] = true;
          queue.add(nxt[0]);
        }
      }
      for(int j=0;j<n;j++){
        if(!isVisited[j]){
          res++;
          break;
        }
      }
    }
    System.out.println(res);
                       
  }
}