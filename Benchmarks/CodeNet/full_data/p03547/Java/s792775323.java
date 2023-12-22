import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    char[] c = br.readLine().replaceAll(" ", "").toCharArray();
    char result = '>';
    if (c[1] < c[2]) result = '<';
    if (c[1] == c[2]) result = '=';
    System.out.println(result);
  }
}
