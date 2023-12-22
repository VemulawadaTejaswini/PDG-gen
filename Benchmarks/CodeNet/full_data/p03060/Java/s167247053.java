import java.util.*;

public class Main{
  static int[] ans;
  static Map<Integer, Integer> map;
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String[] S = sc.nextLine().split(" ");
    String[] T = sc.nextLine().split(" ");
    
    int ans = 0;
    for(int i = 0; i < N; i++){
      int a = Integer.parseInt(S[i]);
      int b = Integer.parseInt(T[i]);
      
      if(a-b > 0){
        ans += a-b;
      }
    }
    System.out.println(ans);
  }
}