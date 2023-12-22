import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();

    for (int i = x; ; i++) {
      if (nextPrime(i)) {
        System.out.println(i);
        break;
      }
    }
  }

  public static boolean nextPrime(int x) {
    for (int i = 2; i < x; i++) {
      if (x % i == 0){
        return false;
      }
    }
    return true;
  }
}
