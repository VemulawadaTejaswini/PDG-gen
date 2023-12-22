import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number_a, number_b, answer;
    number_a = Integer.parseInt(sc.next());
    number_b = Integer.parseInt(sc.next());
    answer = Math.max(Math.max(number_a + number_b, number_a - number_b), number_a * number_b);
    System.out.println(answer);
  }
}
