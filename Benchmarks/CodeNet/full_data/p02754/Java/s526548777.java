import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] data = br.readLine().split(" ");
    br.close();
    long n = Long.parseLong(data[0]);
    long a = Long.parseLong(data[1]);
    long b = Long.parseLong(data[2]);
    long answer = n / (a + b) * a;
    answer += Math.min(a, n % (a + b));
    System.out.println(answer);
  }
}
