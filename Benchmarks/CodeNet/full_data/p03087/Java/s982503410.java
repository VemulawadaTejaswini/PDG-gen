import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

  private static final String STR = "AC";

  public static void main(String[] args) {

    String[] nq = new String[2];
    String s = null;
    List<String[]> lr = null;
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
      nq = br.readLine().split("\\s");
      s = br.readLine();
      lr = new ArrayList<>();
      lr = new ArrayList<>();
      for (int i = 0; i < Integer.parseInt(nq[1]); i++) {
        lr.add(br.readLine().split("\\s"));
      }
    } catch (IOException e) {
      e.printStackTrace();
      System.exit(1);
    }

    int[] result = new int[lr.size()];
    int num = 0;
    for (String[] array : lr) {
      final int start = Integer.parseInt(array[0]) - 1;
      final int end = Integer.parseInt(array[1]);
      final String target = s.substring(start, end);

      for (int i = 0; i < target.length()-1; i++) {
        int j = i + 2;
        final String tmp = target.substring(i, j);
        if (STR.equals(tmp)) {
          result[num]++;
        }
      }
      num++;
    }

    for (int i = 0; i < result.length; i++) {
      System.out.println(result[i]);
    }
  }
}
