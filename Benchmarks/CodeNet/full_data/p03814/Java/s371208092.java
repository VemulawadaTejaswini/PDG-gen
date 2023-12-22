import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String S = sc.nextLine();
    int a = S.indexOf("A");
    int z = S.lastIndexOf("Z");
    System.out.println(z-a+1);
  }
}