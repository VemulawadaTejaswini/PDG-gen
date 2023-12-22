import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Math;

public class Main {  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int qty = Integer.parseInt(br.readLine());
    String[] value = br.readLine().split(" ");
    String [] cost = br.readLine().split(" ");
    int sum = 0;
    
    int[] tValue = new int[qty], tCost = new int[qty];
    for (int i = 0; i < qty; i++) {
      tValue[i] = Integer.parseInt(value[i]);
      tCost[i] = Integer.parseInt(cost[i]);
    }
    
    for (int i = 0; i < qty; i++) {
      int tmp = tValue[i] - tCost[i];
      if (tmp > 0) {
        sum += tmp;
      }
    }
    System.out.println(sum);
  }
}