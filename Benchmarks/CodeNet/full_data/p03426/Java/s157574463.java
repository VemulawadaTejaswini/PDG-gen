import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int h = sc.nextInt();
      int w = sc.nextInt();
      int d = sc.nextInt();

      int n = h * w + 1;
      int[] row = new int[n];
      int[] col = new int[n];

      for(int i = 0; i < h; i++)
        for(int j = 0; j < w; j++) {
            int num = sc.nextInt();
            row[num] = i;
            col[num] = j;
        }
          
      int[] prefixSum = new int[n];
      for(int i = d + 1; i < n; i++) {
        prefixSum[i] = prefixSum[i - d] + Math.abs(row[i] - row[i - d]) + Math.abs(col[i] - col[i - d]);
      }

      int q = sc.nextInt();
      for(int i = 0; i < q; i++) {
        int l = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(Math.abs(prefixSum[l] - prefixSum[r]));
      }
  }
}
