import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line = sc.next();
    Map<Character, Character> map = new HashMap(){{ put('A','T');put('T','A'); put('C','G');put('G','C');}};
    System.out.println(map.get(line.charAt(0)));
  }
}
