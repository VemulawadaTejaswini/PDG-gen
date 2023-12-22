import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    sc.close();
    HashSet<Integer> pfa = getPrimeFactors(a);
    HashSet<Integer> pfb = getPrimeFactors(b);
    Iterator<Integer> it = pfa.iterator();
    int counter = 0;
    while (it.hasNext()) {
      if (pfb.contains(it.next())) {
        counter++;
      }
    }
    System.out.println(counter + 1);
  }
  private static HashSet<Integer> getPrimeFactors(int n) {
    HashSet<Integer> result = new HashSet<Integer>();
    for (int i = 2; i <= n; i++) {
      if (n % i == 0) {
        result.add(i);
        while (n > 1 && n % i == 0) {
          n /= i;
        }
      }
    }
    return result;
  }
}