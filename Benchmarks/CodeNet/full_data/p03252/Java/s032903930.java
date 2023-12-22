import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String S = sc.next();
    String T = sc.next();

    int alphabet_s[] = new int[26];
    int alphabet_t[] = new int[26];
    for (int i = 0; i < 26; i++) {
      alphabet_s[i] = -1;
      alphabet_t[i] = -1;
    }

    for (int i = 0; i < S.length(); i++) {
      int s = S.charAt(i) - 'a';
      int t = T.charAt(i) - 'a';

      if (alphabet_s[s] < 0) {
        alphabet_s[s] = t;
      } else {
        if (alphabet_s[s] != t) {
          System.out.println("No");
          return;
        }
      }
      
      if (alphabet_t[t] < 0) {
        alphabet_t[t] = s;
      } else {
        if (alphabet_t[t] != s) {
          System.out.println("No");
          return;
        }
      }

    }

    System.out.println("Yes");

  }
}