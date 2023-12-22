import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    
    String s=sc.next();
    int k=s.length();
    System.out.print(s.charAt(0));
    System.out.print(k-2);
    System.out.println(s.charAt(k-1));
    sc.close();
  }
}