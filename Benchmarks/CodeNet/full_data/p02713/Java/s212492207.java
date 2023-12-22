import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    List<Integer> list = new ArrayList<>();
    for ( int i = 1; i <= num; i++ ) {
      for ( int j = 1; j <= num; j++ ) {
        for ( int k = 1; k <= num; k++ ) {
          list.add(gcd(i, j, k) );
        }
      }
    }

    int sum = 0;
    for ( int n : list ) {
      sum += n;
    }
    System.out.println(sum);
  }

  private static int gcd(int i, int j, int k) {
    return gcd(gcd(i, j), k);
  }

  private static int gcd(int i, int j) {
    int buf1 = i;
    int buf2 = j;
    while ( true ) {
      if ( buf1 % buf2 == 0 ) break;
      int temp = buf1;
      buf1 = buf2;
      buf2 = temp % buf2;
    }
    return buf2;
  }
}
