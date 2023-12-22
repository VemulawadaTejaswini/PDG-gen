import java.util.*;
public class Main {
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int L = sc.nextInt();
    int R = sc.nextInt();
    
    if ((R / 2019) > (L / 2019)) {
      System.out.println(0);
      return;
    }
    
    int a = Math.min(L%2019, R%2019);
    
    System.out.println(a*(a + 1));
  }  
}
