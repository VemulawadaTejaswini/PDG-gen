import java.util.*;
class Main{
  static Map<Integer,List<Integer>> graph=new HashMap<>();
  static Map<Integer,Integer> dist=new HashMap<>();
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int e=sc.nextInt();
    for(int i=0;i<e;i++){
      populate(sc.nextInt(),sc.nextInt());
    }
    Set<Integer> visited=new HashSet<>();
    int ans=0;
    for(int i:graph.keySet()){
      if(!visited[i]) ans=Math.max(ans,dfs(i,visited));
    }
    System.out.println(ans);
  }
  public static int dfs(int src,Set<Integer> visited){
        if(dist.containsKey(src)) return dist.get(src);
        visited.add(src);
        int current=0;
        for(int nei:graph.getOrDefault(src,new ArrayList<>())){
            if(!visited.contains(nei)) current=Math.max(current,dfs(nei,visited));
        }
    	dist.put(src,1+current);
        return 1+current;
    }
    public static void populate(int i,int j){
            graph.putIfAbsent(i,new ArrayList<>());
            graph.get(i).add(j); 
    }
}