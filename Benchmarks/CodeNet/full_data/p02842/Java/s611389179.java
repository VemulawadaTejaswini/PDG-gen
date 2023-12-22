import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    double X = N/1.08;
    int A = (int)Math.round(X);
    String ans = ":(";
    if(N == (int)(A*1.08)){
      ans = A + "";
    }
    System.out.println(ans);
  }
}