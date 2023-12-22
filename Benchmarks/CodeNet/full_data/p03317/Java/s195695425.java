import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int K = Integer.parseInt(S[1]);
    int ans = 0;
    
    ans = (N-1)/(K-1);
    if((N-1)%(K-1) != 0){
      ans++;
    }
    System.out.println(ans);
  }
}