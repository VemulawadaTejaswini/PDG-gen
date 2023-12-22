import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String S = sc.next();
    String T = sc.next();
    int A = sc.nextInt();
    int B = sc.nextInt();
    String U = sc.next();

    Map<String , Integer> map = new HashMap<>();

    map.put(S, A);
    map.put(T, B);

    map.put(U, map.get(U) - 1);

    System.out.println(map.get(S) + " " + map.get(T));

    sc.close();
  }
}