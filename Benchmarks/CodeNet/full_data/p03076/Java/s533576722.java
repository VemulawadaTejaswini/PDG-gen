import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    new Main().execute(System.in);
//    ByteArrayOutputStream os = new ByteArrayOutputStream();
//    os.write(("123\n" +
//        "123\n" +
//        "123\n" +
//        "123\n" +
//        "123").getBytes());
//    InputStream is = new ByteArrayInputStream(os.toByteArray());
//    new Main().execute(is);
  }

  public void execute(InputStream in) {
    Scanner sc = new Scanner(in);
    int m = 0;
    int maxRest = 0;
    for (int i = 0; i < 5; i++) {
      int t = sc.nextInt();
      int span = (int) Math.ceil((t * 1.0) / 10) * 10;
      m += span;
      int rest = span - t;
      maxRest = Math.max(maxRest, rest);
    }
    System.out.println(m - maxRest);
  }
}