import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] in;
    in = br.readLine().split(" ");
    int n = Integer.parseInt(in[0]);
    int m = Integer.parseInt(in[1]);

    br.close();

    System.out.println((n * (n-1) + m * (m-1)) / 2);
    
  }
}