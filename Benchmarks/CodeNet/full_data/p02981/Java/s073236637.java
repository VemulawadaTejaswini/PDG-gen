import java.util.*;

public class Main {
  public static void main(String[] args) {
    int i, number_n, number_a, number_b;
    Scanner sc = new Scanner(System.in);
    number_n = Integer.parseInt(sc.next());
    number_a = Integer.parseInt(sc.next());
    number_b = Integer.parseInt(sc.next());
    if(number_n * number_a < number_b) System.out.println(number_n * number_a);
    else System.out.println(number_b);
  }
}
