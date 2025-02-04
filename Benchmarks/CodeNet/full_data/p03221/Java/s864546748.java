import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int M = Integer.parseInt(S[1]);
    
    int[][] val = new int[M][2];
    Map<Integer, List<Integer>> map = new HashMap<>();
    for(int i = 0; i < M; i++){
      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next());
      val[i][0] = a;
      val[i][1] = b;
      if(map.containsKey(a)){
        map.get(a).add(b);
      }else{
        map.put(a, new ArrayList<Integer>());
        map.get(a).add(b);
      }
    }
    
    for(int i = 1; i <= N; i++){
      if(map.containsKey(i)){
        Collections.sort(map.get(i));
      }
    }
    
    for(int i = 0; i < M; i++){
      int a = val[i][0];
      int b = map.get(a).indexOf(val[i][1])+1;
      
      System.out.printf("%06d%06d%n", a, b);
    }
  }
}