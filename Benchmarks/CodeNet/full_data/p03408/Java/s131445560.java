import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Map<String,Integer> mp = new HashMap<>();
    for(int i=0;i<n;i++){
      String s = sc.next();
      mp.put(s,mp.getOrDefault(s,0)+1);
    }
    int m = sc.nextInt();
    for(int i=0;i<m;i++){
      String s = sc.next();
      if(mp.containsKey(s)){
        mp.put(s,mp.get(s)-1);
      }
    }
    Iterator<Integer> itr = (mp.values().iterator());
    int max = 0;
    while(itr.hasNext()){
      max = Math.max(itr.next(),max);
    }
    System.out.println(max);
  }
}