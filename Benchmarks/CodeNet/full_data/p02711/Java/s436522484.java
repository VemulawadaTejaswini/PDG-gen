import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {

      
 public static void main(String[] args) {
    
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int N = in.nextInt();
    
    boolean yes = false;
    
    while(N > 0) {
        int d = N%10;
        N /= 10;
        if(d == 7) {
            yes = true;
        }
    }
    
    System.out.println(yes ? "Yes" : "No");
    
  }
  
  
}