import java.util.*;

public class Main {
  public static void main(String[] args) {
    int N;
    String[] s;
    try(Scanner sc = new Scanner(System.in)) {
      N = sc.nextInt();
      s = new String[N];
      for(int i = 0; i < N; i++) {
        s[i] = sc.next();
      }
    }
    String[] sSorted;
    sSorted = new String[N];
    for(int i = 0; i < N; i++) {
      char[] ca = s[i].toCharArray();
      Arrays.sort(ca);
      sSorted[i] = new String(ca);
    }
    long count = 0;
    for(int i = 0; i < N; i++) {
      for(int j = i+1; j < N; j++) {
        if ( sSorted[i].equals(sSorted[j]) ) {
          count++;
        }
      }
    }
    System.out.println(count);
  }
}