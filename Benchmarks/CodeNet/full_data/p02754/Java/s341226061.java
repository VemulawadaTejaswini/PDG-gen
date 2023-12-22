import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    
    int ans;
    if(N % (A+B) < A)
      ans = N / (A+B) * A + N % (A+B);
    else
      ans = N / (A+B) * A + A;
    
    System.out.println(ans);
    
  }
}