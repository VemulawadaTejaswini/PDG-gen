import java.util.Scanner;
 
public class Main {
  public static void main ( String[] args ) {
 
    Scanner sc = new Scanner ( System.in );

    String S = sc.next();

    char[] s = S.toCharArray();
    
    boolean flag = false;
    
    for(int i = 0 ; i < 3 ; i++){
      if(s[i]==s[i+1]){
        flag = true;
        break;
      }
    }
    
    if(flag){
      System.out.println("Bad");
    }else{
      System.out.println("Good");
    }
    
  }
}