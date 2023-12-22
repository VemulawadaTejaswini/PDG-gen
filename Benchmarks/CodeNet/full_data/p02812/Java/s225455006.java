import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String args[]) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    List<String> list = new ArrayList<>();
    String data;
    while ((data = br.readLine()) != null) {
      list.add(data);
    }

    int n = Integer.parseInt(list.get(0)); // 長さ
    String s = list.get(1); // 文字列
    br.close();

    int count = 0;
    int size = n;
    for (int i = 0; i < size; i++) {

      if (size - i >= 3) {
        String tmp = s.substring(i, i + 3);

        if ("ABC".equals(tmp)) {
          count++;
        }
      } else {
        break;
      }
    }
    System.out.println(count);
  }
}