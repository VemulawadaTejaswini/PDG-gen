import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String indx = "abcdefghijklmnopqrstuvwxyz";
    int n = indx.indexOf(S);
    System.out.println(indx.charAt(n+1));
  }
}