import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args)throws Exception{
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    String Sr = new StringBuffer(S).reverse().toString();
    int N = S.length();
    if(!S.equals(Sr)){
      System.out.println("No");
      return;
    }
    
    String T = S.substring(0,(N-1)/2);
    String Tr = new StringBuffer(T).reverse().toString();
    if(!T.equals(Tr)){
      System.out.println("No");
      return;
    }
    System.out.println("Yes");
  }
}