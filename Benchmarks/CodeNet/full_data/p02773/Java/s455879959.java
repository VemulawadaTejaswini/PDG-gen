import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    TreeMap<String,Integer> tm = new TreeMap<>();
    int max = 1;
    for(int i = 0;i<n;i++){
      String s = sc.next();
      if(tm.containsKey(s)){
        tm.put(s,tm.get(s) + 1);
        max = Math.max(max,tm.get(s));
      }else{
        tm.put(s,1);
      }
    }
    for(String ss: tm.keySet()){
      if(tm.get(ss) == max){
        System.out.println(ss);
      }
    }
  }
}
