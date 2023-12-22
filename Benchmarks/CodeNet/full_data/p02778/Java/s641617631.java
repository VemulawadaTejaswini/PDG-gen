import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Strgin s = sc.next();
    s = s.replace("[a-z]","x");
    System.out.println(s);
  }
}
