import java.util.*;
import static java.lang.System.*;
import java.math.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A= new int[N];
    boolean owari=true;
    boolean ans = false;
    int cnt = 1;
    String anss = "YES";
    int cntt = 0;
    for (int i = 0; i < N;i++){
      A[i]=sc.nextInt();
    }
    for (int i = 0; i < N; i++) {
      while (owari) {

        
        if (A[cntt] == A[cnt]) {
          ans = true;
          anss = "NO";
        }
        cnt++;
        if (cnt == N) {
          break;
        }
      }
      cnt = i + 1;
      cntt = i;
      if (ans) {
        break;
      }
    }
    out.print(anss);
  }




  }

