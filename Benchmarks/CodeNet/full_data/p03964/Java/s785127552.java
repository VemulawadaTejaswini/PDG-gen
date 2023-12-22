import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    long a = 1;
    long b = 1;
    
    for(int i = 0; i < N; i++){
      String[] S = sc.nextLine().split(" ");
      int x = Integer.parseInt(S[0]);
      int y = Integer.parseInt(S[1]);
      
      long n = (long)Math.ceil(Math.max(((float)a/x), ((float)b/y)));
      
      a = x * n;
      b = y * n;
      
    }
    
    long ans = a + b;
    System.out.println(ans);
  }
}