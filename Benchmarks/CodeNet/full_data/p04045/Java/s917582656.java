import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int tmpN = n;
    int k = sc.nextInt();
    Integer[] d = new Integer[k];
    int digit = 0;
    for (int cnt = 0; cnt < k; cnt++) {
      d[cnt] = sc.nextInt();
    }
    while (n >= Math.pow(10, digit)) {
      int lastN = tmpN % 10;
      if (Arrays.asList(d).contains(lastN)) {
        n += Math.pow(10, digit);
        tmpN += 1;
      } else {
        tmpN /= 10;
        digit++;
      }
    }
    System.out.println(n);
    sc.close();
  }
}