import java.io.*;
import java.util.*;
public class Main {
  public static int array[];
  public static void main(String[] args) throws Exception {
    String line = null;
    int id = 0;
    int res = 0;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    line = br.readLine();
    line = br.readLine();
    String data[] = line.split(" ");
    array = new int[data.length];
    for (int i = 0; i < data.length; i ++) {
      int num = Integer.parseInt(data[i]);
      array[i] = num;
    }

    while (true) {
      id = getMinId();
      res = doSubtract(id);
      if (res == -1) {
        System.out.println("NO");
        return;
      } else if (res == 0) {
        System.out.println("YES");
        return;
      }
    }

  }

  public static int doSubtract(int id) {
    int i = id;
    int res = 0;
    for (int j = 0; j < array.length; j++) {
      array[i] = array[i] - (j + 1);
      if (array[i] < 0) {
        return -1;
      } else if (array[i] > 0) {
        res = 1;
      }
      if (i == (array.length - 1)) {
        i = 0;
      } else {
        i = i + 1;
      }
    }
    return res;
  }

  public static int getMinId() {
    int minVal = array[0];
    int minId = 0;
    for (int i = 0; i < array.length; i++) {
      int v = array[i];
      if (v < minVal) {
        minVal = v;
        minId = i;
      }
    }
    return minId;
  }

}