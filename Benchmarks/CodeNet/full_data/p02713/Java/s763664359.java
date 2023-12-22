import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long result = 0;
    Gcd gcd = new Gcd();

    int k = Integer.parseInt(br.readLine());
    for (int i=1; i<=k; i++) {
      for (int j=1; j<=k; j++){
        for (int l=1; l<=k; l++) {
          int temp = gcd.gcd(i, j);
          result += gcd.gcd(temp, l);
        }
      }
    }
    System.out.println(result);
  }
}
class Gcd {
  int[][] array = new int[201][201];

  public int gcd(int a, int b) {
    if (array[a][b] != 0){
      return array[a][b];
    }
    if (array[b][a] != 0) {
      return array[b][a];
    }
    if(a < b) return gcd(b, a);
    if(b == 0) {
      array[a][b] = a;
      return b;
    }
    return array[a][b] = gcd(b, a % b);
  }
}
