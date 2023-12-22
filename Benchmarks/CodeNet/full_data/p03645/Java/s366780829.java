import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int target, num;
    String str = br.readLine();
    StringTokenizer st = new StringTokenizer(str);
    target = Integer.parseInt(st.nextToken());
    num = Integer.parseInt(st.nextToken());

    int[] startTo = new int[200000];
    int[] toGoal = new int[200000];

    for (int i = 0; i < num; i++) {
      str = br.readLine();
      st = new StringTokenizer(str);
      startTo[i] = Integer.parseInt(st.nextToken());
      toGoal[i] = Integer.parseInt(st.nextToken());
    }

    boolean flag = false;
    for (int i = 0; i < 200000; i++) {
      for (int j = 0; j < 200000; j++) {
        if (startTo[i] == toGoal[j]) {
          System.out.println("POSSIBLE");
          flag = true;
          break;
        }
        if (flag) {
          break;
        }
      }
    }

    if (!flag) {
      System.out.println("IMPOSSIBLE");
    }
  }

}