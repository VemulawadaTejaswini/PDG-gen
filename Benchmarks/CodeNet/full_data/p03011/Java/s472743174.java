import java.util.*;

public class Main{
  public static void main(String[] arts){
    Scanner scan = new Scanner(System.in);
    int p = scan.nextInt();
    int q = scan.nextInt();
    int r = scan.nextInt();
    
    System.out.println(p + q + r - Math.max(p,q,r));
  }
}