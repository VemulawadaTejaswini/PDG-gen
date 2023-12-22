import java.util.*;

public class Main{
  
  public static void main (String []args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int a = 0;
    int b = 0;
    
    for (int i = 0; i <= 2; i++){
      if (s.charAt(i) == 'A'){
        a++;
      }else {
        b++;
      }
    }
    if (a == 3 || b ==3 ){
      System.out.println("No");
    }else{
      System.out.println("Yes");
    }
  }
}
        
      
      
      