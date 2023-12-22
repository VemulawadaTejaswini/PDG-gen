import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    char[] arrayS = S.toCharArray();
    int lenS = arrayS.length;
    int K = 0;
    for(int i = 0; i < lenS; i++) {
      if(arrayS[i] == '0') {
        K++;
      }
    }
    System.out.println(K);
  }
}
