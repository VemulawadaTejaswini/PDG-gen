import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    Map<String, Integer> map = new HashMap<>();
    for(int i = 0; i < N; i++){
      String S = sc.nextLine();
      if(map.containsKey(S)){
        map.put(S, map.get(S)+1);
      }else{
        map.put(S, 1);
      }
    }
    
    int M = Integer.parseInt(sc.nextLine());
    for(int i = 0; i < M; i++){
      String S = sc.nextLine();
      if(map.containsKey(S)){
        map.put(S, map.get(S)-1);
      }
    }
    
    int max = 0;
    for(int val : map.values()){
      max = val > max ? val : max;
    }
    System.out.println(max);
  }
}