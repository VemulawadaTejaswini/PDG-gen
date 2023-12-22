import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    String A = sc.next();
    String B = sc.next();

    sc.close();

    String result = "";

    if (A.equals(B)) {
      result = "EQUAL";
    } else {
      if (A.length() < B.length()){
        result = "LESS";
      } else if (B.length() < A.length()) {
        result = "GREATER";
      } else {
        for (int i = 0; i < A.length(); i++) {
          int a = Integer.valueOf(A.substring(i, i+1));
          int b = Integer.valueOf(B.substring(i, i+1));
          if (a < b) {
            result = "LESS";
            break;
          } else {
            result = "GREATER";
            break;
          }
        }
      }
    }

    System.out.println(result);

  }

}