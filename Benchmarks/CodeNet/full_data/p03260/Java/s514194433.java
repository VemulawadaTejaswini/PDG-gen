import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] strs = br.readLine().split(" ");
    int A = Integer.parseInt(strs[0]);
    int B = Integer.parseInt(strs[1]);
    if (A * B % 2 == 0) {
      System.out.println("No");
    } else {
      System.out.println("Yes");
    }
  }
}