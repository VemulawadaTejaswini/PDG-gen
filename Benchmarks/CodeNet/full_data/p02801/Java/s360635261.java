import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String t = scan.next();
    String g = "abcdefghijklmnopqrstuvwxyza";
    for (int i=0;i<g.length();i++){
      if (g.charAt(i) == t.charAt(0)){
        System.out.println(g.charAt(i+1));
        return;
      }
    }
  }
}
