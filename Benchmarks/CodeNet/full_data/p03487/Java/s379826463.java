import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Map<Integer, Integer> map = new HashMap<>();
    for(int i = 0; i < n; i++){
      int tmp = sc.nextInt();
      if(!map.containsKey(tmp)){
        map.put(tmp, 0);
      }
      map.put(tmp, map.get(tmp) + 1);
    }
    int sum = 0;
    for(int num : map.keySet()){
      if(num == map.get(num)){
        continue;
      }else if(num < map.get(num)){
        sum += map.get(num) - num;
      }else{
        sum += map.get(num);
      }
    }
    System.out.println(sum);
  }
}