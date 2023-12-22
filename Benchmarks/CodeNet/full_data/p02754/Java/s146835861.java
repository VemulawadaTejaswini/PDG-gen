import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    long n = Integer.parseInt(str[0]);
    long a = Integer.parseInt(str[1]);
    long b = Integer.parseInt(str[2]);
    
    long quo = n/(a+b);
    long rem = n%(a+b);
    
    System.out.println((rem >= 4 && rem <= 7) || rem == 0?quo*a:(quo*a)+rem);
  }
}