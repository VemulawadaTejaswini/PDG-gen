import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char[] c = new char[4];

    for(int i = 0;i < 4;i++) {
      c[i] = s.charAt(i);
    }

    Arrays.sort(c);

    if(c[0] == c[1] && c[2] == c[3] && c[1] != c[2]) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }


  }

}
