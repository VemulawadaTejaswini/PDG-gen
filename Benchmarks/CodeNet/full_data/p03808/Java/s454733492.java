import java.io.*;
import java.util.*;
public class Main {
  public static int array[];
  public static int minId;
  public static int minVal;
  public static void main(String[] args) throws Exception {
    String line = null;
    int res = 0;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    line = br.readLine();
    line = br.readLine();
    String data[] = line.split(" ");
    array = new int[data.length];

    minVal = Integer.parseInt(data[0]);
    for (int i = 0; i < data.length; i ++) {
      int num = Integer.parseInt(data[i]);
      array[i] = num;
      if (num < minVal) {
        minVal = num;
        minId = i;
      }
    }

    while (true) {
      res = doSubtract();
      if (res == -1) {
        System.out.println("NO");
        return;
      } else if (res == 0) {
        System.out.println("YES");
        return;
      }
    }
  }

  public static int doSubtract() {
    int i = minId;
    int res = 0;
    minVal = array[0];
    minId = 0;
    for (int j = 0; j < array.length; j++) {
      array[i] = array[i] - (j + 1);
      if (array[i] < 0) {
        return -1;
      } else if (array[i] > 0) {
        res = 1;
      }
      int v = array[i];
      if (v < minVal) {
        minVal = v;
        minId = i;
      }
      if (i == (array.length - 1)) {
        i = 0;
      } else {
        i = i + 1;
      }
    }
    return res;
  }

}