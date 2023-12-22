import java.util.*;
import java.io.*;

public class TwoAnagrams{
  public static void main(String args[]) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s[] = br.readLine().split("");
    String t[] = br.readLine().split("");
    Arrays.sort(s);
    Arrays.sort(t,Comparator.reverseOrder());
    if(s.compareTo(t) < 0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}