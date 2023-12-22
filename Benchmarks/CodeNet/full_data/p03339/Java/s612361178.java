import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    br.readLine();
    String s = br.readLine();
    int n = s.length();
    long min = n;
    
    for(int i = 0; i < n; i++) {
      long f = s.substring(0, i).chars().filter(x -> x == 'W').count();
      long b = s.substring(i + 1).chars().filter(x -> x == 'E').count();
      
      min = Math.min(min, f + b);
    }
    
    System.out.println(min);
  }
}
