import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int l = S.length();
    if(!parin(S)){
      System.out.println("No");
      return;
    }
    String zenhan = S.substring(0,(l-1)/2);
    String kouhan = S.substring((l+1)/2,l);
    if(!parin(zenhan)||!parin(kouhan)){
      System.out.println("No");
      return;
    }
    System.out.println("Yes");
  }
  
  public static boolean parin(String S){
    for(int i=0;i<S.length()-1;i++){
      if(!S.substring(i,i+1).equals(S.substring(S.length()-i-1,S.length()-i))){
        return false;
      }
    }
    return true;
  }
    
      
  }
  

  