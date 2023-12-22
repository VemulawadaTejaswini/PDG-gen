import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    sc.close();

    String[] s = S.split("");

    int[] l = new int[s.length+1];
    int[] r = new int[s.length+1];

    int count = 0;

    for (int i = 0; i < s.length; i++) {
      l[i] = count;
      if (s[i].equals("<")) {
        count++;
      } else {
        count = 0;
      }
    }
    l[s.length] = count;

    count = 0;

    for (int i = s.length - 1; 0 <= i; i--) {
      r[i+1] = count;
      if (s[i].equals(">")) {
        count++;
      } else {
        count = 0;
      }
    }
    r[0] = count;

    long answer = 0;

    for (int i = 0; i <= s.length; i++) {
      answer += Math.max(l[i], r[i]);
    }

    System.out.println(answer);

  }

}