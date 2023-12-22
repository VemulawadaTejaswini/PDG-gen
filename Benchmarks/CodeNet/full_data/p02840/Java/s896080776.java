import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Sum_Difference_Main {
  @SuppressWarnings("resource")
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();
    int init = sc.nextInt();
    int add = sc.nextInt();

    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < num; i++, init += add) {
      list.add(init);
    }

    Set<Integer> result = new HashSet<>();

    for (int i = 0; i < Math.pow(2, num); i++) {
      int sumS = 0;
      int sumT = 0;

      String binary =
          String.format("%" + num + "s", Integer.toBinaryString(i)).replaceAll(" ", "0");

      for (int j = 0; j < num; j++) {
        if (binary.charAt(j) == '0') {
          sumS += list.get(j);
        } else {
          sumT += list.get(j);
        }
      }
      result.add(sumS - sumT);
    }

    System.out.println(result.size());
  }
}
