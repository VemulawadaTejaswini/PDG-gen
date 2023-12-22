import java.io.*;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(br.readLine());
    int[] an = new int[n];
    String[] data = br.readLine().split(" ");
    
    for (int i=0; i<n; i++){
      an[i] = Integer.parseInt(data[i]);
    }
    int[] results = new int[n-1];
    int temp = 0;
    int sum = Arrays.stream(an).sum();
    for (int i=0; i<n-1; i++){
      temp += an[i];
      results[i] = Math.abs(sum-temp-temp);
    }
    System.out.println(Arrays.stream(results).min().getAsInt());
  }
}
