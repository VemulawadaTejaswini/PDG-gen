import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    
    int ans;
    int setn = N / (A+B);
    if(N % (A+B) < A)
      ans = setn * A + N % (A+B);
    else
      ans = setn * A + A;
    
    System.out.println(ans);
    
  }
}