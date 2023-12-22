import java.util.*;
public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt(), B = sc.nextInt();
    int ans = -1;
    for (int i=A; i<B*100+1; i++){
       if ((int)(i*0.08) == A && (int)(i*0.1) == B) {
         ans = i;
         break;
       }
    }
    System.out.println(ans);
  }
}