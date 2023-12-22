import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] strs = br.readLine().split(" ");
    int[] num = new int[3];
    for (int i = 0; i < 3; i++) {
      num[i] = Integer.parseInt(strs[i]);
    }
    Arrays.sort(num);
    
    System.out.println(num[0] * num[1] / 2);
  }
}