import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.lang.StringBuilder;

public class Main {
  public static void main(String[] args ){

    // 10^15以上は、打ち切りでよい
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int K = sc.nextInt();

    int result = 0;
    for(int i = 0; i < S.length(); i++) {
      if (S.charAt(i) != '1') {
        result = (int)(S.charAt(i) - '0');
        break;
      }
    }

    System.out.println(result);
  }
}
