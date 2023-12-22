import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double answer;
    int i, number;
    number = Integer.parseInt(sc.next());
    int[] values = new int[number];
    for(i = 0; i < number; i++) values[i] = Integer.parseInt(sc.next());
    Arrays.sort(values);
    answer = values[0];
    for(i = 1; i < number; i++) {
      answer = (answer + values[i]) / 2.0;
    }
    System.out.println(answer);
  }
}
