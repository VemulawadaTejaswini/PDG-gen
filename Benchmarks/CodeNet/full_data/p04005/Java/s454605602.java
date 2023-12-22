import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String[] S  = sc.nextLine().split(" ");
    int A = Integer.parseInt(S[0]);
    int B = Integer.parseInt(S[1]);
    int C = Integer.parseInt(S[2]);
    int sum = A * B * C;
    
    int ansA = (sum - (B * C * (A / 2))) - (B * C * (A / 2));
    int ansB = (sum - (C * A * (B / 2))) - (C * A * (B / 2));
    int ansC = (sum - (A * B * (C / 2))) - (A * B * (C / 2));
    
    int ans = (Math.min(ansA, Math.min(ansB, ansC)));
    System.out.println(ans);
  }
}