import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int Q = sc.nextInt();
    Map<Integer,Integer> append = new HashMap<>();
    Map<Integer,Integer> remove = new HashMap<>();
    
    for(int i = 0; i < N; i++){
      int s = sc.nextInt();
      int t = sc.nextInt();
      int x = sc.nextInt();
      append.put(s-x, x);
      remove.put(t-x, x);
    }
    append.forEach((k,v)->{
    	System.out.println(k + " " + v);
    });
    Map<Integer, Integer> D = new HashMap<>();
    for(int i = 0; i< Q; i++){
      int d = sc.nextInt();
      D.put(i, d);
    }
    
    List<Integer> ans = new ArrayList<>();
    int[] A = new int[Q];
    
    for(Map.Entry<Integer, Integer> m : D.entrySet()){
      Iterator<Map.Entry<Integer, Integer>> app = new HashMap<Integer, Integer>(append).entrySet().iterator();
      Iterator<Map.Entry<Integer, Integer>> rem = new HashMap<Integer, Integer>(remove).entrySet().iterator();
      while(app.hasNext()){
        Map.Entry<Integer, Integer> entry = app.next();
        if(entry.getKey() <= m.getValue()){
          ans.add(entry.getValue());
          append.remove(entry.getKey(), entry.getValue());
        }
      }
      while(rem.hasNext()){
        Map.Entry<Integer, Integer> entry = rem.next();
        if(entry.getKey() <= m.getValue()){
          ans.remove(ans.indexOf(entry.getValue()));
          remove.remove(entry.getKey(), entry.getValue());
        }
      }
      if(!ans.isEmpty()){
        A[m.getKey()] = ans.get(0);
      }else{
        A[m.getKey()] = -1;
      }
    }
    for(int i : A){
      System.out.println(i);
    }
  }
}