import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    sc.close();
    
    Set<Integer> set = new HashSet<>();
    set.add(A);
    set.add(B);
    set.add(C);
    System.out.println(set.size() == 2 ? "Yes" : "No");
  }
}