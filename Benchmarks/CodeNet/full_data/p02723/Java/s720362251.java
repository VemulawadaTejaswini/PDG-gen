import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String[] s = S.split("");
    if (s[2].equals(s[3]) && s[4].equals(s[5])){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}