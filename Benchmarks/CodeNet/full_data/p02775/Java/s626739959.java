
import static sun.swing.MenuItemLayoutHelper.max;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final String n = scanner.next();
    List<Integer> ns = new ArrayList<>();
    int sum =0;

    for (int i = 0; i < n.length(); i++) {
      ns.add(Character.getNumericValue(n.toCharArray()[i]));
    }

    for (int i = ns.size()-1; i >= 0; i--) {
      sum += 10 - ns.get(i) > ns.get(i) ? ns.get(i) : 0;
    }
    System.out.println(sum);


  }


}
