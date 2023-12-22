import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Map<String, Integer> treeMap = new TreeMap<>();
    
    for(int i=0; i<N; i++){
      String S =sc.next();
      if(!treeMap.containsKey(S)){
        treeMap.put(S, 1);
      }else{
        treeMap.put(S, treeMap.get(S) + 1);
      }
    }
    int max = 0;
    for(String key: treeMap.keySet()){
      if(max < treeMap.get(key)){
        max = treeMap.get(key);
      }
    }
    for(String key: treeMap.keySet()){
      if(treeMap.get(key) == max){
        System.out.println(key);
      }
    }
  }
}
    