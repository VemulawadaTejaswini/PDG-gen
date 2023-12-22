import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] line1 = br.readLine().split(" ");
    int n = Integer.parseInt(line1[0]);
    int m = Integer.parseInt(line1[1]);
    
    boolean[] red = new boolean[n];
    int[] num = new int[n];
    
    red[0] = true;
    
    for (int i=0; i<n; i++){
      num[i] = 1;
    }
    
    String[] data;
    int x;
    int y;
    
    for (int i=0; i<m; i++){
      data = br.readLine().split(" ");
      x = Integer.parseInt(data[0])-1;
      y = Integer.parseInt(data[1])-1;
      
      if (red[x]){
        red[y] = true;
      }
      num[x]--;
      num[y]++;
      if (num[x] == 0){
        red[x] = false;
      }
    }
    int result = 0;
    for (boolean b : red){
      if (b) result++;
    }
    System.out.println(result);
  }
}
