import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String T = sc.next();
    
    for(int i=0; i<S.length(); i++){
      if(S.equals(T)){
        System.out.println("Yes");
        return;
      }
      int leng = S.length();
      S = S.charAt(leng-1) + S;
      S = S.substring(1);
    }
    System.out.println("No");
  }
}