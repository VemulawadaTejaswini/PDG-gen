import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int length = sc.nextInt();
    String string = sc.next();
    char[] array = string.toCharArray();
    int sum = 0;

    for ( int i = 1; i <= length; i++ ) {
      for ( int j = i + 1; j <= length; j++ ) {
        for ( int k = j + 1; k <= length; k++ ) {
          if ( (j - i) == (k - j) ) continue;
          sum += decision(array, i, j, k);
        }
      }
    }
    System.out.println(sum);
  }
  private static int decision(char[] array, int i, int j, int k) {
    if ( array[i-1] == array[j-1] ) return 0;
    if ( array[i-1] == array[k-1] ) return 0;
    if ( array[j-1] == array[k-1] ) return 0;
    return 1;
  }
}
