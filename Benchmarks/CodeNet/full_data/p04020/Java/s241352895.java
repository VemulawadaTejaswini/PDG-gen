import java.io.*;
import java.util.*;
public class Main {
  public static void main(String[] args) throws Exception {
    String line = null;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    line = br.readLine();
    int nn = Integer.parseInt(line);
    int cards = 0;
    int answer = 0;
    int pair = 0;
    int val = 0;
    for (int i = 1; i <= nn; i++) {
      line = br.readLine();
      val = Integer.parseInt(line);
      if (val == 0) {
        if (cards != 0) {
          pair = cards / 2;
          answer = answer + pair;
          cards = 0;
        }
      } else {
        cards = cards + val;
      }
    }
    if (cards != 0) {
      pair = cards / 2;
      answer = answer + pair;
    }
    System.out.println(answer);
  }

}