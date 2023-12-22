import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    ArrayList<Integer> prime = getPrimes();
    Scanner input = new Scanner(System.in);
    
    while (input.hasNext()) {
      long A = input.nextLong();
      long B = input.nextLong();
      
      int count = 1;
      for (int i = 0; i < prime.size(); ++i) {
        if (prime.get(i) > A || prime.get(i) > B) {
          break;
        } else if (A % prime.get(i) == 0 && B % prime.get(i) == 0) {
          ++count;
        }
      }
      
      if (A == B && A > 1_000_000 && count == 1) {
        ++count;
      }
      
      System.out.println(count);
    }
  }
  
  public static ArrayList<Integer> getPrimes() {
    boolean[] isPrime = new boolean[1_000_000 + 1];
    Arrays.fill(isPrime, true);
    
    for (int i = 2; i < isPrime.length; ++i) {
      if (isPrime[i]) {
        for (int j = i + i; j < isPrime.length; j += i) {
          isPrime[j] = false;
        }
      }
    }
    
    ArrayList<Integer> prime = new ArrayList<Integer> ();
    for (int i = 2; i < isPrime.length; ++i) {
      if (isPrime[i]) {
        prime.add(i);
      }
    }
    
    return prime;
  }
}