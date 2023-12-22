import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int button_a, button_b, answer;
    button_a = Integer.parseInt(sc.next());
    button_b = Integer.parseInt(sc.next());
    if(button_a > button_b) {
      answer = 2 * button_a - 1;
    } else if(button_b > button_a) {
      answer = 2 * button_b -1;
    } else {
      answer = 2 * button_a;
    }
    System.out.println(answer);
  }
}
