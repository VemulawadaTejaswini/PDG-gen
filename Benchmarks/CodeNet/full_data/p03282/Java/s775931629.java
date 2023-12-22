import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String S = sc.next();
    long K = sc.nextLong();
    
    if(S.charAt(0)=='1'){
      System.out.println(S.charAt(1));
    } else {
      System.out.println(S.charAt(0));
    }
  }
}

