import java.util.*;
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
      int A = Integer.parseInt(scanner.next());
      int B = Integer.parseInt(scanner.next());
      int C = Integer.parseInt(scanner.next());
      int D = Integer.parseInt(scanner.next());
      int area_1 = A*B;
      int area_2 = C*D;
      if (area_1<area_2){
        System.out.println(area_2);
      } else {
        System.out.println(area_1);
      }
    }
}
      