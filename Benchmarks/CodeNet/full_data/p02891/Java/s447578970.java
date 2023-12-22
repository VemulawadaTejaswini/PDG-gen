import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    String S = sc.next();
    int K = sc.nextInt();

    sc.close(); 

    String[] s = S.split("");

    long count = 0;
    boolean isChange = false;

    for (int i = 0; i < s.length - 1; i++) {
      if (s[i].equals(s[i+1]) && (isChange == false)) {
        count++;
        isChange = true;
      } else {
        isChange = false;
      }
    }

    System.out.println(count * K);

  }

}