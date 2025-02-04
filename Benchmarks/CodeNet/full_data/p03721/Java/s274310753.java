import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    List<Integer> list = new ArrayList<>();
    Map<Integer, Integer> map = new HashMap<>();
    for(int i = 0; i < n; i++){
      int a = sc.nextInt();
      int b = sc.nextInt();
      if(!map.containsKey(a)){
        map.put(a, 0);
        list.add(a);
      }
      map.put(a, map.get(a) + b);
    }
    long sum = 0;
    Collections.sort(list);
    for(int i : list){
      sum += map.get(i);
      if(sum >= k){
        System.out.println(i);
        System.exit(0);
      }
    }
  }
}