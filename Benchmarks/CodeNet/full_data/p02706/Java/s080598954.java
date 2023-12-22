import java.util.stream.*;
import java.io.*;

public class Main {

  static int n, m;
  static int[] a;
  
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] in = br.readLine().split(" ");
    n = Integer.parseInt(in[0]);
    m = Integer.parseInt(in[1]);

    in = br.readLine().split(" ");
    a = Stream.of(in).mapToInt(Integer::parseInt).toArray();

    br.close();

    int s = 0;

    for(int i = 0; i < m; i++){
      s += a[i];
    }
    System.out.println(n - s >= 0 ? n - s : -1);
  }
}