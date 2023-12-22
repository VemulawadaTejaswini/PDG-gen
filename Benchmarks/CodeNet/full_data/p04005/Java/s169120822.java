import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String[] S  = sc.nextLine().split(" ");
    int A = Integer.parseInt(S[0]);
    int B = Integer.parseInt(S[1]);
    int C = Integer.parseInt(S[2]);
    int sum = A * B * C;
    int l = Math.max(A, Math.max(B, C));
    int m = Math.min(A*B, Math.min(B*C, C*A));
    int ans = Math.abs((l/2 * m) - (sum - (l/2 * m)));
    
    System.out.println(ans);
  }
}