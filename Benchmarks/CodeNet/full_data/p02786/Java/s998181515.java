import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      long n = sc.nextLong();

      System.out.println(recursive(n));
  }

  static Map<Long, Long> cache = new HashMap<>();
  
  private static long recursive(long n) {
    if(cache.containsKey(n))
      return cache.get(n);
    if(n == 1)
      return 1;

    long sum = recursive(n / 2) * 2 + 1;

    cache.put(n, sum);
    return sum;
  }
}