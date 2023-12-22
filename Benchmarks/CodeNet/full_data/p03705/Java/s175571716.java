import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int A = Integer.parseInt(sc.next());
    int B = Integer.parseInt(sc.next());
    
    int ans = 0;
    if((A > B) || (N == 1 && A != B)){
      ans = 0;
    }else if(N == 1){
      ans = 1;
    }else{
      int a = B * (N-1) + A;
      int b = A * (N-1) + B;
      ans = a - b + 1;
    }
    System.out.println(ans);
  }
}
      