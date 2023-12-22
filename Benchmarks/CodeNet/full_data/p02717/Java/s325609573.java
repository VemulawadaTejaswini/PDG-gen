import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        System.out.println(solve(in));
        
      }
      
      public static String solve(Scanner in) {
       int A = in.nextInt();
       int B = in.nextInt();
       int C = in.nextInt();

       return C + " " + A + " " + B;
      }
    
}