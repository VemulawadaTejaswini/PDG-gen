import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int R = Integer.parseInt(reader.readLine());
    System.out.println(2*R*Math.acos(-1));
  }
}