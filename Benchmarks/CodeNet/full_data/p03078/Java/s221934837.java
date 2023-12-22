import java.util.*;

public class Main {

  private long[] tasteList;
  private int k = 0;

  public static void main(String[] args) {
    Main m = new Main();
    m.read();
    m.exec();
  }

  private void read() {
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    int y = scan.nextInt();
    int z = scan.nextInt();
    k = scan.nextInt();
    long[] xList = new long[x];
    for (int i = 0; i < x; i++) {

    }
    long[] yList = new long[y];
    for (int i = 0; i < y; i++) {

    }
    long[] zList = new long[z];
    for (int i = 0; i < z; i++) {

    }
    tasteList = new long[x * y * z];
    int index = 0;
    for (long l : xList) {
      for (long m : yList) {
        for (long n : zList) {
          tasteList[index] = l + m + n;
          index++;
        }
      }
    }
  }

  private void exec() {
    Arrays.sort(tasteList);
    for (int i = 1; i <= k; i++) {
      System.out.println(String.valueOf(tasteList[tasteList.length - i]));
    }
  }
}