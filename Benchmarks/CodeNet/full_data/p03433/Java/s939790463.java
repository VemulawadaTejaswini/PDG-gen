import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String n = in.readLine();
    int a = Integer.parseInt(in.readLine());
    int n_sub = Integer.parseInt(n.substring(n.length()-2,n.length()));
    System.out.println(a>=n_sub?"Yes":"No");
  }
}