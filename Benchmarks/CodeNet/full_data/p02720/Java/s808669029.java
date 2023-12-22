import java.util.*;
import java.math.*;

public class Main {

  static int k;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    k = sc.nextInt();
    ArrayList<Long> list = new ArrayList<Long>();
    for (long i = 1; i < 10; i++) {
      list.add(i);
    }
    int c = 0;
    while (list.size() < k) {
      long a = list.get(c);
      if (a%10 != 0) list.add((a*10) + (a%10)-1);
      list.add((a*10) + (a%10));
      if (a%10 != 9) list.add((a*10) + (a%10)+1);
      c++;
    }
    System.out.println(list.get(k-1));
  }

}
