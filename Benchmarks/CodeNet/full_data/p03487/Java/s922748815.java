import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    TreeMap<Integer,Integer> tm = new TreeMap<>();
    for(int i = 0;i<n;i++){
      int a = sc.nextInt();
      if(tm.containsKey(a)){
        tm.put(a,tm.get(a)+1);
      }else{
        tm.put(a,1);
      }
    }
    long ans = 0l;
    for(int aa:tm.keySet()){
      if(aa<tm.get(aa)){
        ans += tm.get(aa) - aa;
      }else if(aa>tm.get(aa)){
        ans += tm.get(aa);
      }
    }
    System.out.println(ans);
  }
}
