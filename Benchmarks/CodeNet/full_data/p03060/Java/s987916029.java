import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Integer n = Integer.parseInt(sc.nextLine());
    List<Integer> vs = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt)
        .collect(Collectors.toList());
    List<Integer> cs = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt)
        .collect(Collectors.toList());

    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum += Math.max(vs.get(i) - cs.get(i), 0);
    }

    System.out.println(sum);
  }
}
