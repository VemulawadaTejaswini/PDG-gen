import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b, c, answer;
    a = Integer.parseInt(sc.next());
    b = Integer.parseInt(sc.next());
    c = Integer.parseInt(sc.next());
    if(a - b >= c) answer = 0;
    else answer = c - (a - b);
    System.out.println(answer);
  }
}
