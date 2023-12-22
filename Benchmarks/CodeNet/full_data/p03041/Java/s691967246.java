import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] strs =  br.readLine().split(" ");
    int N = Integer.parseInt(strs[0]);
    int K = Integer.parseInt(strs[1]) - 1;
    String s = br.readLine();
    String[] tmp = new String[N];
    for (int i = 0; i < N; i++) {
      tmp[i] = String.valueOf(s.charAt(i));
    }
    tmp[K] = tmp[K].toLowerCase();
    System.out.println(String.join("", tmp));
  }
}