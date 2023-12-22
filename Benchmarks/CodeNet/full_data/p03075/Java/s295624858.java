import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] number = new int[6];
    for (int i = 0; i < 6; i++) {
      number[i] = Integer.parseInt(br.readLine());
    }
    int K = number[5];
    int range = 0;
    String ans = "Yay!";
    for (int i = 0; i < 5; i++) {
      for (int j = i + 1; j < 5; j++) {
        range = number[j] - number[i];
        if (range > K) {
          ans = ":(";
          break;
        }
        range = 0;
      }
      if (ans != "Yay!") break;
    }
    System.out.println(ans);
  }
}