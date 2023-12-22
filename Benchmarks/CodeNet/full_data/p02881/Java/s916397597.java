import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long min = Long.MAX_VALUE;
    for (int i = 1; i * i <= N; i++) {
      if (N % i == 0) {
        min = Math.min(min, i + (N / i));
      }
    }
    System.out.println(min - 2);// System.out.println(list.stream().mapToInt(x -> x).min());
  }
}
