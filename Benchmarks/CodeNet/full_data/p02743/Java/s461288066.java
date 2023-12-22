import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] data = br.readLine().split(" ");
    long a = Integer.parseInt(data[0]);
    long b = Integer.parseInt(data[1]);
    long c = Integer.parseInt(data[2]);
    String result = a + b + 2*Math.sqrt(a*b) < c ? "Yes" : "No";
    
    System.out.println(result);
  }
}
