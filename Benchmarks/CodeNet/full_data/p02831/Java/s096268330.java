import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    long a = Long.parseLong(str[0]);
    long b = Long.parseLong(str[1]);
    long div = 1;
    boolean flg = true;
    for(int i=2; i<=a; i++) {
      long a_tmp = a;
      if(a_tmp%i==0 && b%i==0){
        div *= i;
        a_tmp = a_tmp/i;
        flg = false;
      }
    }
    System.out.println(flg==false?a*b/div:a*b);
  }
}