import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());

      	if (A > B) {
          System.out.println(A * 2 - 1);
        } else if (A == B) {
          System.out.println(A * 2);
        } else {
          System.out.println(B * 2 - 1);
        }
    }
}
