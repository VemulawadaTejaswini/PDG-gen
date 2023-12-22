import java.io.*;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String[] line = br.readLine().split(" ");
    int[] monsters = new int[n+1];
    int i;
    for(i=0; i<=n; i++)
      monsters[i] = Integer.parseInt(line[i]);
    line = br.readLine().split(" ");
    int[] braves = new int[n];
    for(i=0; i<n; i++)
      braves[i] = Integer.parseInt(line[i]);
    
    int count = 0;
    int tmp, killed;
    for(i=0; i<n; i++){
      tmp = braves[i];
      killed = Math.min(tmp, monsters[i]);
      monsters[i] -= killed;
      tmp -= killed;
      killed = Math.min(tmp, monsters[i+1]);
      tmp -= killed;
      monsters[i+1] -= killed;
      count += braves[i] - tmp;
    }
    System.out.println(count);
  }
}
