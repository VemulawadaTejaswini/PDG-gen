import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] strs = br.readLine().split(" ");
    Arrays.sort(strs);
    int A = Integer.parseInt(strs[0]);
    int B = Integer.parseInt(strs[1]) + Integer.parseInt(strs[2]) * 10;
    
    System.out.println(A + B);
  }
}