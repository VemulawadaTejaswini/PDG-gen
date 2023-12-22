
import java.util.*;
import java.io.*;

public class TestClass {
    public static void main(String args[] ) throws Exception {
       
       //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = br.readLine();
        int n = Integer.parseInt(line1);
      int ans = 180*(n-2);
      System.out.println(ans);
       
    }
}
