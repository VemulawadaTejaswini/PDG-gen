import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    String S = sc.next();
    
    int count = 0;
    for (int i = 0; i+2 < N; i++) {
      if (
      S.charAt(i) == 'A' &&
      S.charAt(i+1) == 'B' &&
      S.charAt(i+2) == 'C'
      ) {
        count++;
      }
    }
    
    System.out.println(count);
  }
}