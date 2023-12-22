import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int M = scan.nextInt();
    //  List<Integer> l = new LinkedList<>();
    long[] array = new long[N];
    for (int i = 0; i < N; i++) {
      array[i] = scan.nextLong();
    }
    // List<Integer> sortedList = l.stream().sorted().collect(Collectors.toList());
    Arrays.sort(array);
    int B;
    int C;
    long sl;

    Map<Integer, Integer> map = new TreeMap<>();
    for (int i = 0; i < M; i++) {
      B = scan.nextInt();
      C = scan.nextInt();
      map.put(C, B);
    }
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      int tmpB = entry.getValue();
      for (int j = 0; j < N; j++) {
        if (entry.getKey() <= array[j]) {
          break;
        }
        array[j] = entry.getKey();
        //sortedList.set(j, C);
        if (--tmpB <= 0) {
          break;
        }
      }
      Arrays.sort(array);
    }
//    for (EntrySetint i = 0; i < M; i++) {
//      int tempB =
//      int tempC = map.get(M - i + 1);
//      for (int j = 0; j < N; j++) {
//
//        //sl = sortedList.get(j);
//        //sl = array[j];
//        if (tempC <= array[j]) {
//          break;
//        }
//        array[j] = tempC;
//        //sortedList.set(j, C);
//        if (--B <= 0) {
//          break;
//        }
//      }
//      // sortedList = sortedList.stream().sorted().collect(Collectors.toList());

    long result = 0;

    for (int i = 0; i < array.length; i++) {
      result += array[i];
    }
    System.out.println(result);
  }
}
