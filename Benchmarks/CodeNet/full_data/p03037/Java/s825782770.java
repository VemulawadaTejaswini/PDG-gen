import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int n = Integer.parseInt(str[0]);
    int m = Integer.parseInt(str[1]);
    int[] l = new int[m];
    int[] r = new int[m];
    int l_max = 0;
    int r_min = 100000;
    for(int i=0; i<m; i++) {
      str = in.readLine().split(" ");
      l[i] = Integer.parseInt(str[0]);
      l_max = Math.max(l[i],l_max);
      r[i] = Integer.parseInt(str[1]);
      r_min = Math.min(r[i],r_min);
    }
    System.out.println(r_min-l_max+1>0?r_min-l_max+1:0);
  }
}