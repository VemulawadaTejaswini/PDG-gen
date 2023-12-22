import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int M = scan.nextInt();
    List<Integer> l = new LinkedList<>();
    for (int i = 0; i < N; i++) {
      l.add(scan.nextInt());
    }
    List<Integer> sortedList = l.stream().sorted().collect(Collectors.toList());
    int B;
    int C;
    int sl;
    for (int i = 0; i < M; i++) {
      B = scan.nextInt();
      C = scan.nextInt();
      for (int j = 0; j < N; j++) {
        sl = sortedList.get(j);
        if (C <= sl) {
          break;
        }
        sortedList.set(j, C);
        B--;
        if (B <= 0) {
          break;
        }
      }
      sortedList = sortedList.stream().sorted().collect(Collectors.toList());
    }
    long result = 0;
    for (Integer i : sortedList) {
      result += i;
    }
    System.out.println(result);
  }
}
