import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int x = Integer.parseInt(str[0]);
    int y = Integer.parseInt(str[1]);
    int[] group = {0, 1, 3, 1, 2, 1, 2, 1, 1, 2, 1, 2, 1};
    System.out.println(group[x]==group[y]?"Yes":"No");
  }
}