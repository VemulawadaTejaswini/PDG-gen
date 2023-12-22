import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    char c1 = S.charAt(0);
    char c2 = '.';
    int a = 1, b = 0;
    
    if(S.charAt(1) == c1){
      a++;
    }else{
      c2 = S.charAt(1);
      b++;
    }
    
    if(S.charAt(2) == c1){
      a++;
    }else if(S.charAt(2) == c2){
      b++;
    }else{
      c2 = S.charAt(2);
      b++;
    }
    
    if(S.charAt(3) == c1){
      a++;
    }else if(S.charAt(3) == c2){
      b++;
    }
    
    System.out.println(a==2 && b==2 ? "Yes" : "No");
  }
}