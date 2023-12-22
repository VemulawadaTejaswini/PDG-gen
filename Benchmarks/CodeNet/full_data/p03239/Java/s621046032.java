import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int n = Integer.parseInt(str[0]);
    int t = Integer.parseInt(str[1]);
    int[] c = new int[n];
    int[] t_s = new int[n];
    int min = 10000;
    boolean flg = false;
    for(int i=0; i<n; i++) {
      str = in.readLine().split(" ");
      c[i] = Integer.parseInt(str[0]);
      t_s[i] = Integer.parseInt(str[1]);
    }
    for(int i=0; i<n; i++) {
      if(t_s[i]<=t){
        min = Math.min(min,c[i]);
        flg = true;
      }
    }
    System.out.println(flg==true?min:"TLE");
  }
}