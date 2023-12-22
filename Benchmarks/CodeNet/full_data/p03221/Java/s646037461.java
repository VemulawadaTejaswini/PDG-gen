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
      String[] T = sc.nextLine().split(" ");
      int a = Integer.parseInt(T[0]);
      int b = Integer.parseInt(T[1]);
      val[i][0] = a;
      val[i][1] = b;
      if(map.containsKey(a)){
        map.get(a).add(b);
        Collections.sort(map.get(a));
      }else{
        map.put(a, new ArrayList<Integer>());
        map.get(a).add(b);
      }
    }
    
    for(int i = 0; i < M; i++){
      int a = val[i][0];
      int b = map.get(a).indexOf(val[i][1])+1;
      
      String s = String.format("%06d%06d", a, b);
      System.out.println(s);
    }
  }
}