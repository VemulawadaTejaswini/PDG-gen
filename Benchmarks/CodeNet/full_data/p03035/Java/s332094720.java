import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int A = Integer.parseInt(S[0]);
    int B = Integer.parseInt(S[1]);
    
    int ans = B;
    if(A <= 5){
      ans = 0;
    }else if(A <= 12){
      ans = B/2;
    }
    
    System.out.println(ans);
  }
}