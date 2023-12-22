import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  private static final char[] ACGT = {'A', 'C', 'G', 'T'};

  public static void main(String[] args) {

    String tmp = null;
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      tmp = br.readLine();
    } catch (IOException e) {
      e.printStackTrace();
      System.exit(1);
    }

    int result = 0;
    char[] in = tmp.toCharArray();
    for (int i = 0; i < in.length; i++) {
      int num = 0;
      for (int j = i; j < in.length; j++) {
        boolean b = false;
        for (int l = 0; l < ACGT.length; l++) {
          if (in[j] == ACGT[l]) {
            b = true;
            num++;
            break;
          }
        }
        if (!b) {
          break;
        }
      }
      if (result < num) {
        result = num;
      }
    }

    System.out.print(result);
  }
}

