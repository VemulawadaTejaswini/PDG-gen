import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int ans = 7;
    if(s.equals("MON")) ans = 6;
    if(s.equals("TUE")) ans = 5;
    if(s.equals("WED")) ans = 4;
    if(s.equals("THU")) ans = 3;
    if(s.equals("FRI")) ans = 2;
    if(s.equals("SAT")) ans = 1;
    System.out.println(ans);
  }
}
