import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int a = Integer.parseInt(str[0]);
    int b = Integer.parseInt(str[1]);
    int k = Integer.parseInt(str[2]);
    for(int i=a; i<=b; i++) {
      if(i<a+k)
        System.out.println(i);
      else if(i>b-k)
        System.out.println(i);
    }
  }
}