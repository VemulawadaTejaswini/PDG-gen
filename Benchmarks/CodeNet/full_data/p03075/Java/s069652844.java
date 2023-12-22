import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    new Main().execute(System.in);
//    ByteArrayOutputStream os = new ByteArrayOutputStream();
//    os.write(("15\n" +
//        "18\n" +
//        "26\n" +
//        "35\n" +
//        "36\n" +
//        "20").getBytes());
//    InputStream is = new ByteArrayInputStream(os.toByteArray());
//    new Main().execute(is);
  }

  public void execute(InputStream in) {
    Scanner sc = new Scanner(in);
    List<Integer> list = Arrays.asList(
        sc.nextInt(),
        sc.nextInt(),
        sc.nextInt(),
        sc.nextInt(),
        sc.nextInt()
    );
    int k = sc.nextInt();

    for (int i = 0; i < list.size() - 1; i++) {
      int a = list.get(i);
      for (int j = 1; j < list.size(); j++) {
        int b = list.get(j);

        if (b - a > k) {
          System.out.println(":(");
          return;
        }
      }
    }
    System.out.println("Yay!");
  }
}
