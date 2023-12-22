import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
public class Main {
  public static void main(String... args) {
    Scanner scan = new Scanner(System.in);
    scan.next();
    List<Double> list = new ArrayList<>();
    while (scan.hasNextInt()) {
      list.add(Double.valueOf(scan.next()));
    }
    Collections.sort(list);
    Optional<Double> res = list.stream().reduce((acc,x)->{
      return acc==0?x:(acc+x)/2;
    });
    System.out.println(res.get());
  }
}