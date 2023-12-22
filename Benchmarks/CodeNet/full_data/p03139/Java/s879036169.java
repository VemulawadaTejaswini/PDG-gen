import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int N = scan.nextInt();
    int A = scan.nextInt();
    int B = scan.nextInt();
    int max = 0;
    int min = 0;

    if (A+B <= N) {
      if(A<B){
        max = A;
      }
      else if(B<A){
        max = B;
      }
    }else{
    min = Math.abs(A-B);
    if(A>B)max=B;
    else if(B>A) max = A;
    else {
      min = A;
      max = A;
    }
    }
    System.out.println(max+" "+min);
  }
}
