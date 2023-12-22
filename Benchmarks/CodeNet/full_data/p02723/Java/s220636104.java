import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        System.out.println(solve(in));
        
      }
      
      public static String solve(Scanner in) {
       String s = in.next();

        if (s.charAt(2) == s.charAt(3) && s.charAt(4) == s.charAt(5)) return "Yes";
        return "No";
      }
      
    
}