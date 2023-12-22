import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int a = Integer.parseInt(str[0]);
    int b = Integer.parseInt(str[1]);
    if(a/0.08==b/0.1)
      System.out.println(a/0.08);
    else if(a/0.08>b/0.1)
      if((int)Math.abs((a/0.08)*0.1)==a)
        System.out.println((int)a/0.08);
      else
        System.out.println(-1);
    else
      if((int)Math.abs((b/0.1)*0.08)==b)
        System.out.println((int)b/0.1);
      else
        System.out.println(-1);
  }
}