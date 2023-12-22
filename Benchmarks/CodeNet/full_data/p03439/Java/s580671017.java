import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(0);
    System.out.flush();
    String s0 = sc.next();
    if(s0.equals("Vacant")) System.exit(0);
    int left = 0;
    int right = n;
    int ans = 0;
    while(left < right) {
      int med = (left + right) / 2;
      System.out.println(med);
      System.out.flush();
      String s = sc.next();
      if(s.equals("Vacant")) System.exit(0);
      if((med - left) % 2 == 0) {
        if(s.equals(s0)) {
          left = med + 1;
          ans = left;
        } else {
          right = med;
          ans = med - 1;
        }
      } else {
        if(s.equals(s0)) {
          right = med;
          ans = med - 1;          
        } else {
          left = med + 1;
          ans = left;          
        }        
      }           
    }
    System.out.println(ans);
    System.out.flush();
    String sfi = sc.next();
    if(sfi.equals("Vacant")) System.exit(0);    
  }
}
