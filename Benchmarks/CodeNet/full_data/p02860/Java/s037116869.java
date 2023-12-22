import java.util.*;

public class Main {
  public static void main(String... args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    String S = scan.next();
    
    boolean res = N!=1 ? true : false;
    for(int i=0;i<N/2;i++) {
      if(S.charAt(i) != S.charAt(i+N/2)) {
        res = false;
        break;
      }
    }
    System.out.println(res ? "Yes" : "No");
  }
}