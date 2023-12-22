import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int M = Integer.parseInt(sc.next());
    
    int[][] val = new int[M][3];
    for(int i = 0; i < M; i++){
      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next());
      val[i][0] = a;
      val[i][1] = b;
      val[i][2] = i;
    }
    Arrays.sort(val, (a, b) -> Integer.compare(a[1], b[1]));
    
    String[] ans = new String[M];
    int[] count = new int[N+1];
    for(int i = 0; i < M; i++){
      int a = val[i][0];
      count[a]++;
      String S = String.format("%06d%06d", a, count[a]);
      ans[val[i][2]] = S;
    }
    
    for(int i = 0; i < M; i++){
     System.out.println(ans[i]); 
    }
  }
}