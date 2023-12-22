import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int k = Integer.parseInt(br.readLine());

    int sum = 0;
    for (int i = 1; i <= k; i++) {
      for (int j = 1; j <= k; j++) {
        for (int s = 1; s <= k; s++) {
          sum += gcd(i, j, s);
        }
      }
    }
    
    System.out.print(sum);
  }
  
  private static int gcd(int i, int j, int s) {
  	return gcdTwo(gcdTwo(i, j), s);
  }
  
  private static int gcdTwo(int i, int j) {
  	if (j == 0) {
      return i;
    }
    int r = i % j;
    return gcdTwo(j, r);
  }
}
