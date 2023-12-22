import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    if(s.equals("a") || s.equals("i") || s.equals("u") || s.equals("e") || s.equals("o")){
      System.out.println("vowel");
    }else{
      System.out.println("consonant");
    }
  }
}
