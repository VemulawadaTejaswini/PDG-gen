import java.io.*;

public class Main {
  public static void main(String... args) {
    BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));

    try {
      String[] line = br.readLine().split(" ");
      int n = Integer.parseInt(line[0]);
      int k = Integer.parseInt(line[1]);
      int q = Integer.parseInt(line[2]);
      int[] order = new int[q];
      int[] point = new int[n];

      for(int i = 0; i < point.length; i++) {
        if(i < order.length) {
          order[i] = Integer.parseInt(br.readLine());
          point[order[i] - 1] += 1; 
        }
        point[i] += k - q;
      }

      for(int i = 0; i < point.length; i++) {
        if(point[i] <= 0) {
          System.out.println("No");
        } else {
          System.out.println("Yes");
        }
      }

      br.close();
    } catch(IOException e) {
      e.printStackTrace();
    }
  }
}