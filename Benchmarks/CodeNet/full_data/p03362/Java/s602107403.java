import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int i = 2;
    int count = 0;
    List<Integer> prime = new ArrayList<>();
    while (count < N) {
      int tmp = 5*i + 1;
      if (isPrime(tmp)) {
        prime.add(tmp);
        count++;
      }
      i++;
    }
    for (i=0;i<N;i++) {
      System.out.print(prime.get(i));
      if (i!=N-1) {
        System.out.print(" ");
      }
    }
  }

  private static boolean isPrime(int a) {
    double sqrt = Math.pow(a, 0.5);
    if (a == 2 || a == 3) {
      return true;
    }
    for (int i=2; i<sqrt+1; i++) {
      if (a % i == 0) {
        return false;
      }
    }
    return true;
  }
}
