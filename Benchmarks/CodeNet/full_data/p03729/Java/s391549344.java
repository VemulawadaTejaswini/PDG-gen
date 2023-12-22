import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    String c = sc.next();
    String a2 = a.charAt(a.length()-1);
    String b1 = b.charAt(0);
    String b2 = b.charAt(b.length()-1);
    String c1 = c.charAt(0);
    if(a2 == b1 && b2 == c1){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}