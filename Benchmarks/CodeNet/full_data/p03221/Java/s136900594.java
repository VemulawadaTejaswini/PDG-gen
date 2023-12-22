import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] mae = new int[m];
    int[] rank = new int[n];
    TreeMap<Integer,TreeMap<Integer,Integer>> map = new TreeMap<Integer,TreeMap<Integer,Integer>>();
    String[] ans = new String[m];
    for(int i = 0; i < m; i++){
      int p = sc.nextInt();
      int y = sc.nextInt();
      mae[i] = p;
      if(!map.containsKey(p)){
        map.put(p,new TreeMap<Integer,Integer>());
      }
      map.get(p).put(y,i);
    }
    for(int i = 1; i <= n; i++){
      if(map.containsKey(i)){
        Iterator<Integer> it = map.get(i).keySet().iterator();
        while(it.hasNext()){
          int key = it.next();
          ans[map.get(i).get(key)] = String.format("%06d%06d",mae[map.get(i).get(key)],++rank[i-1]);
        }
      }
    }
    for(String s : ans){
      System.out.println(s);
    }
  }
}
