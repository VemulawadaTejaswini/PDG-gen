import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    int count = 0;
    String ABC;
    
    for (int i = 0; i < N-2 ;i++) {
      ABC = S.substring(i, i + 3);
      if (ABC.equals("ABC")){
        count++;
      }
    }
    System.out.print(count);
  }
}