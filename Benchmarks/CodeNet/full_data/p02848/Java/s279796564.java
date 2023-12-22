import java.util.*;

public class Main {
  static final String ascii = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int index = sc.nextInt();
    String s = sc.next();
    
    String replaced = "";
    for (int i = 0 ; i < s.length() ; i++){
      char c = s.charAt(i);
      int si = ascii.indexOf(c);
      int ri = si + index;
      if(ri > ascii.length()){
        ri = ri - ascii.length();
      }
      replaced = replaced + ascii.indexOf(ri);
    }
    System.out.println(replaced);
  }
}