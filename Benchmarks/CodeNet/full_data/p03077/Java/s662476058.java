import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    new Main().execute(System.in);
//    ByteArrayOutputStream os = new ByteArrayOutputStream();
//    os.write(("10000000007\n" +
//        "2\n" +
//        "3\n" +
//        "5\n" +
//        "7\n" +
//        "11").getBytes());
//    InputStream is = new ByteArrayInputStream(os.toByteArray());
//    new Main().execute(is);
  }

  public void execute(InputStream in) {
    Scanner sc = new Scanner(in);
    long n = sc.nextLong();
    long[] ns = new long[] { n, 0,0,0,0,0 };
    long[] x = new long[] { sc.nextLong(), sc.nextLong(), sc.nextLong(), sc.nextLong(), sc.nextLong() };

    long t = 0;
    while(ns[ns.length - 1] != n) {
      for (int i = ns.length - 2; i >= 0; i--) {
        long y = Math.min(ns[i], x[i]);
        ns[i + 1] += y;
        ns[i] -= y;
      }
      t++;
    }
    System.out.println(t);
  }
}
