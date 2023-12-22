import java.io.*;
import java.util.*;
import java.math.*;
public class Main {
  public static void main(String[] args) throws Exception {
    String line = null;
    double num = 0;
    double rem = 0;
    double res = 0;
    double[] array = new double[4];
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    line = br.readLine();
    String price[] = line.split(" ");
    line = br.readLine();
    double vol = Double.parseDouble(line);
    // 配列に1リットルあたりの単価を登録
    array[0] = Double.parseDouble(price[0]) * 4;         // 0.25L
    array[1] = Double.parseDouble(price[1]) * 2;         // 0.50L
    array[2] = Double.parseDouble(price[2]);             // 1.00L
    array[3] = (double)Double.parseDouble(price[3]) / 2; // 2.00L
    // 0.25L, 0.5L. 1Lの単価の最小値
    double minPrice = Math.min(Math.min(array[0], array[1]), array[2]);
    if (vol < 2) {
      res = minPrice * vol;
    } else {
      if (minPrice < array[3]) {
        res = minPrice*vol;
      } else {
        num = vol / 2;            // 買える数
        num = Math.floor(num);    // 小数点以下切り捨て
        rem = vol - 2 * num;      // 買えない数(1 or 0)
        res = (array[3] * 2 * num) + (minPrice * rem);
      }
    }
    System.out.println((long)res);
  }

}