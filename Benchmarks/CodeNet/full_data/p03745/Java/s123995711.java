import java.io.*;
import java.util.*;
public class Main {
  public static void main(String[] args) throws Exception {
    String line = null;
    long oldValue = 0;
    long newValue = 0;
    long oldDiff = 0;
    long newDiff = 0;
    int count = 1;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    line = br.readLine();
    line = br.readLine();
    String data[] = line.split(" ");
    for (int i = 0; i < data.length; i ++) {
      newValue = Long.parseLong(data[i]);
      if (i == 0) {
        newDiff = 0;
      } else {
        newDiff = newValue - oldValue;
      }
      oldValue = newValue;
      if (oldDiff > 0 && newDiff < 0) {
        count = count + 1;
        oldDiff = 0;
      } else if (newDiff > 0 && oldDiff < 0) {
        count = count + 1;
        oldDiff = 0;
      } else {
        oldDiff = newDiff;
      }
    }
    System.out.println(count);
  }
}