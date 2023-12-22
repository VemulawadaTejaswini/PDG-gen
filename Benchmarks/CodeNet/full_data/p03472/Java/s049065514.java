import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int HP = Integer.parseInt(S[1]);
    
    int[][] val = new int[N][2];
    int max = 0;
    for(int i = 0; i < N; i++){
      String[] T = sc.nextLine().split(" ");
      val[i][0] = Integer.parseInt(T[0]);
      val[i][1] = Integer.parseInt(T[1]);
      max = val[i][0] > max ? val[i][0] : max;
    }
    
    Arrays.sort(val, (a, b)->Integer.compare(b[1], a[1]));
    int ans = 0;
    for(int i = 0; i < N; i++){
      if(max < val[i][1]){
        HP -= val[i][1];
        ans++;
      }
      if(HP <= 0){
        System.out.println(ans);
        return;
      }
    }
    
    ans += HP / max;
    if(HP%max != 0){
      ans++;
    }
    System.out.println(ans);
  }
}