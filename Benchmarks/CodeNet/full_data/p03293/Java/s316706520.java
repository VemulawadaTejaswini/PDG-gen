import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    byte[] s = br.readLine().getBytes();
    byte[] t = br.readLine().getBytes();
    
    Arrays.sort(s);
    Arrays.sort(t);
    
    if(Arrays.equals(s, t)) {
      System.out.println("Yes");
    }
    else {
      System.out.println("No");
    }
  }
}
