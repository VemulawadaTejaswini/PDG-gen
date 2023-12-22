import java.io.*;
import java.util.*;

public class Main {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  static int[][] arr, indices;
  static int[] prefix;
  
	public static void main (String[] args) throws IOException {    
    String[] first = br.readLine().split(" ");
    int H = Integer.parseInt(first[0]);
    int W = Integer.parseInt(first[1]);
    int D = Integer.parseInt(first[2]);
    
    arr = new int[H][W];
    indices = new int[H*W+1][2];
    prefix = new int[H*W+1];
    
    for(int i = 0; i < H; i++) {
      String[] line = br.readLine().split(" ");
      for(int j = 0; j < W; j++) {
        int curr = Integer.parseInt(line[j]);
        arr[i][j] = curr;
        indices[curr] = new int[]{i+1, j+1};
      }
    }
      
    for(int j = 1; j <= H*W; j++) {
      if(j + D <= H*W) {
        int[] a = indices[j];
        int[] b = indices[j+D];
        int curr = Math.abs(b[0]-a[0]) + Math.abs(b[1]-a[1]);
        if(j - D <= 0) {
          prefix[j] = curr;
        }
        else {
          prefix[j] = prefix[j-D] + curr;
        }
      }
    }
    
    int Q = Integer.parseInt(br.readLine());
    
    for(int i = 0; i < Q; i++) {
      String[] line = br.readLine().split(" ");
      int L = Integer.parseInt(line[0]);
      int R = Integer.parseInt(line[1]);
      
      int ans = 0;
      
      if(R < D) {}
      else if(L < D) {
        ans = prefix[R-D];
      }
      else {
        ans = prefix[R-D]-prefix[L-D]; 
      }
      
      bw.write(ans + "\n");
    }
    
    bw.close();
	}
}
