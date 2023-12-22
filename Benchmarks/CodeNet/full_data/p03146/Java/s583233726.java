import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long s = sc.nextLong();
    ArrayList<Long> list = new ArrayList<Long>();
    list.add(s);
    int ans = 0;
    for(int i = 1; i <= 1000000; i++) {
      if((s % 2) == 0) {
        s /= 2;
      } else {
        s = 3 * s + 1;
      }
      if(list.contains(s)) {
        ans = i + 1;
        break; 
      } else {
        list.add(s);
      }
    }
    System.out.println(ans);
  }
}