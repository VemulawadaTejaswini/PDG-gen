import java.util.Scanner;
import java.util.ArrayDeque;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    String[] s = scanner.next().split("");
    ArrayDeque<String> result = new ArrayDeque<>();
    
    for(String input: s) {
      // "B"なら後ろから一つ捨てる
      if(input.equals("B")) {
        result.pollLast();
      // それ以外なら後ろに追加する
      } else {
    	result.offerLast(input);
      }
    }
    
    for(String r: result) {
      System.out.print(r);
    }
  }
}