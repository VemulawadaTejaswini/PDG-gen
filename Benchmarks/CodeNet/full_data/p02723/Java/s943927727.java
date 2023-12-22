import java.util.*;
class solution{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    char t = S.charAt(2);
    char f = S.charAt(3);
    char fi = S.charAt(4);
    char si = S.charAt(5);
    if(t == f && fi == si)
      System.out.println("Yes");
    else
      System.out.println("No");
    
  }
}