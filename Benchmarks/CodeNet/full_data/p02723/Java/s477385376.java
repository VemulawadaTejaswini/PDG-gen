import java.lang.*;
import java.util.*;

Class Main{
  public static void main(String[] a){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    char[] s=str.toCharArray();
    
    if((s[2]==s[3]) && (s[4]==s[5])){
      System.out.println("Yes");
    }
    else
      System.out.println("No");
  }
}
      
    