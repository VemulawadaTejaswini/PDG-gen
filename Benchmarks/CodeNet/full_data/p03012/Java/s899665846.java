import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    List<Integer> weights = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      Integer weight = sc.nextInt();
      weights.add(weight);
    }
    int result = N*100;
    for (int i = 0; i < N; i++) {
      int a = weights.subList(0,i).stream().mapToInt(Integer::intValue).sum();
      int b = weights.subList(i,weights.size()).stream().mapToInt(Integer::intValue).sum();
      int temp = Math.abs(a - b);
      if (temp < result) {
        result = temp;
      }
    }
    System.out.println(result);
  }
}