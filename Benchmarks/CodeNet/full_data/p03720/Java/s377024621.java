import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] line1 = br.readLine().split(" ");
    int n = Integer.parseInt(line1[0]);
    int m = Integer.parseInt(line1[1]);
    
    int[] cities = new int[n];
    int a;
    int b;
    String[] data;
    for (int i=0; i<m; i++){
      data = br.readLine().split(" ");
      a = Integer.parseInt(data[0])-1;
      b = Integer.parseInt(data[1])-1;
      cities[a]++;
      cities[b]++;
    }
    for (int i : cities){
      System.out.println(i);
    }
  }
}
