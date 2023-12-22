import java.io.*;
import java.util.*;
public class Main {

  public static void main (String args[]) throws Exception {
  
    if(oddEven() == 1) {
        System.out.println("Odd");
    } else {
        System.out.println("Even");
    }
  }
 
  public static int oddEven() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        StringTokenizer st;
        int prod = 0;
        String[] tmp = line.split(" ");
        prod = Integer.parseInt(tmp[0]) * Integer.parseInt(tmp[1]);
        
        return prod % 2;
  }

}