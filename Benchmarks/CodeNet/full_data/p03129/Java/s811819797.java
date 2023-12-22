import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] in = br.readLine().split(" ");
    int n = Integer.parseInt(in[0]);
    int k = Integer.parseInt(in[1]);

    br.close();

    System.out.println((n+1) / 2 >= k ? "YES" : "NO");
    
  }
}