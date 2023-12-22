import java.util.*;
import java.io.*;
public class atcoder{
  public static void main(String[] args)throws IOException{
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s = in.readLine();
    if(s.charAt(2) == s.charAt(3) && s.charAt(4) == s.charAt(5)) System.out.println("Yes");
    else System.out.println("No");
  }
}