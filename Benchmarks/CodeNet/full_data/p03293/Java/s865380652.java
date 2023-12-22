import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String T = sc.next();
    int leng = S.length();
    
    for(int i=0; i<S.length(); i++){
      if(S.equals(T)){
        System.out.println("Yes");
        return;
      }
      S = S.charAt(leng-1) + S;
      S = S.substring(0,leng);
    }
    System.out.println("No");
  }
}