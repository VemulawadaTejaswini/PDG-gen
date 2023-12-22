import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] line1 = br.readLine().split(" ");
    int n = Integer.parseInt(line1[0]);
    int k = Integer.parseInt(line1[1]);
    
    
    int[] array = new int[100000];
    String[] data;
    int a;
    int b;
    for (int i=0; i<n; i++){
      data = br.readLine().split(" ");
      a = Integer.parseInt(data[0]);
      b = Integer.parseInt(data[1]);
      array[a-1] += b;
    }
    int temp = 0;
    for (int i=0; i<10000; i++){
      temp += array[i];
      if (temp>=k) {
        System.out.println(i+1);
        return;
      }
    }
  }
}
