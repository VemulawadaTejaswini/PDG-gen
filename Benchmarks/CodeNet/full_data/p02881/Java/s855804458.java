import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();

    long b = Long.MAX_VALUE /2;
    long c = Long.MAX_VALUE /2;
    List<Long> list = factorization(a);
    for (long i : list) {
        if((a/i + i) < (b + c) ){
          b = a/i;
          c = i;
        }
    }
    System.out.println(b + c -2);
  }

  static List<Long> factorization(long x) {
    List<Long> result = new ArrayList<>();

    while (x >= 4 && x % 2 == 0) {
        result.add(2);
        x /= 2;
    }
    long d = 3;
    long q = x / d;
    while (q >= d) {
        if (x % d == 0) {
            result.add(d);
            x = q;
        } else {
            d += 2;
        }
        q = x / d;
    }
    result.add(x);
    return result;
  }
}