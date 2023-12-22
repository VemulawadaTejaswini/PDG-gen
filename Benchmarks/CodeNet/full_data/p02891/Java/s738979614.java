import java.util.*;
import java.util.stream.*;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String S = sc.next();
    long K = sc.nextLong();
    long answer = 0;

    // 全部同じ
    if(S.matches("^" + S.charAt(0) + "+$")) {
      answer = S.length() * K / 2;
    }
    else {

      long count = 0;
      String bef = null;

      for(String s : S.split("")) {
        if(s.equals(bef)) {
          count++;
          bef = null;
        }
        else {
          bef = s;
        }
      }

      if(S.charAt(0) == S.charAt(S.length() - 1)) {
        int length = S.length();
        long a = length - S.replaceAll("^" + S.charAt(0) + "+", "").length();
        long b = length - S.replaceAll(S.charAt(length - 1) + "+$", "").length();
        answer = count * K - (a/2 + b/2 - (a+b)/2) * (K - 1);
      }
      else {
        answer = count * K;
      }

    }

    System.out.println(answer);


  }

}
