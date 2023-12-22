import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    long total = 0;
    for (int i = 0; i < N; i++) {
      String x = sc.next();
      String u = sc.next();
      if ("JPY".equals(u)) {
        long value = Long.parseLong(x);
        total += (value*100000000);
      } else {
        long value = x100000000(x);
        total += (value*380000);
      }
    }
    
    System.out.println(divide100000000(total));
  }
  
  private static long x100000000(String x) {
    if (x.charAt(0) == '0') {
      // leading 0, skip 0 and '.'
      for (int i = 2; i < x.length(); i++) {
        if (x.charAt(i) != '0') {
          return Long.parseLong(x.substring(i, x.length()));
        }
      }
    } else {
      for (int i = 0; i < x.length(); i++) {
        if (x.charAt(i) == '.') {
          return Long.parseLong(x.substring(0, i) + x.substring(i+1, x.length()));
        }
      }
    }
    // not reach
    return 0;
  }
  
  private static String divide100000000(long value) {
    String v = Long.toString(value);
    if (v.length() > 8) {
      return v.substring(0, v.length() - 8) + "." + v.substring(v.length() - 8);
    } else {
      StringBuilder builder = new StringBuilder("0.");
      for (int i = 0; i < 8 - v.length(); i++) {
        builder.append('0');
      }
      return builder.append(v).toString();
    }
  }
}