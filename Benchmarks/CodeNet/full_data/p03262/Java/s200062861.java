import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int X = Integer.parseInt(S[1]);
    String[] T = sc.nextLine().split(" ");
    int ans = 1000000000;
    for(int i = 0; i < N; i++){
      int n = Integer.parseInt(T[i]);
      ans = Math.abs(n-X) < ans ? Math.abs(n-X) : ans;
    }
    System.out.println(ans);
  }
}