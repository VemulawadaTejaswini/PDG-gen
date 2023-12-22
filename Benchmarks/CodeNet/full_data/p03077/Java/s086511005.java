import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long current = sc.nextLong();
    List<Long> intArgs = new ArrayList<>();
    while(sc.hasNext()) {
      intArgs.add(sc.nextLong());
    }

    long currentMod = current;
    long last = 1;
    long sum = 0;

    for(Long next : intArgs) {
      last = calc(current, currentMod, next, last);
      sum += last;
      currentMod = current % next;
      currentMod = currentMod == 0 ? next : currentMod;
      current = next;
    }

    System.out.println(sum);
  }

  public static long calc(long current, long currentMod, long arg, long last) {
    long num = currentMod;
    if (arg < current) {
      num += (current - arg) * (last - 1);
    }
    return new BigDecimal(num / arg).setScale(0, BigDecimal.ROUND_UP).longValue();
  }
}