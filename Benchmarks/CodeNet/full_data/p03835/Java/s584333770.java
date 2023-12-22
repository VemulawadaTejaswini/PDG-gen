import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] data = br.readLine().split(" ");
    
    int k = Integer.parseInt(data[0]);
    int s = Integer.parseInt(data[1]);
  
    long result = 0;
    
    for (int i=0; i<=k; i++){
      result += getNumAllocation(s-i, k);
    }
    
    System.out.println(result);
  }
  public static int getNumAllocation(int sum, int max){
    if (sum <= max){
      return sum+1;
    } else if (sum <= max*2){
      return 2*max-sum+1;
    } else {
      return 0;
    }
  }
}
