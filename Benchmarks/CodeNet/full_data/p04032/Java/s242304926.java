import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{
  public static void main(String args[]){
    String S = new Scanner(System.in).nextLine();
    for(int i = 0; i < S.length(); i++){
      for(int j = i; j < S.length()-i; j++){ 
        String[] s = S.substring(i,j).split("");
        Set<String> chars = Set.copyOf(Arrays.asList(s));
        for(String c:chars){
          if((s.count(c) > s.length/2) && s.length > 1){
            System.out.println(i+1 +" "+ j);
            System.exit(0);
          }
        }
      }
    }
  System.out.println("-1 -1");
  }
}
      