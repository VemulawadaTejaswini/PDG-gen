import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int A = Integer.parseInt(S[0]);
    int B = Integer.parseInt(S[1]);
    int AB = Integer.parseInt(S[2]);
    int X = Integer.parseInt(S[3]);
    int Y = Integer.parseInt(S[4]);
    
    int dif = Math.abs(X-Y);
    int ans = 0;
    if(A+B > AB*2){
      ans += Math.min(X, Y) * AB * 2;
      if(A < AB*2 && X > Y){
        ans += A * dif;
      }else if(B < AB*2 && X < Y){
        ans += B * dif;
      }else{
        ans += AB * dif * 2;
      }
    }else{
      ans += A*X;
      ans += B*Y;
    }
    System.out.println(ans);
  }
}