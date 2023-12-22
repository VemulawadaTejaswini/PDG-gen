import java.util.Scanner;

public class Main{
  public static void main(String[] args){
  	Scanner scan = new Scanner(System.in);
    
    String str = scan.next();
    String a = new String();
    
    int len = str.length();
    len--;
    
    String ans = new String();
    int i;
    for(i = 0; i < len; i++){
      if(ans.length() == 0 && str.charAt(i) =='B'){
      	
      }
      else if(str.charAt(i) != 'B' && str.charAt(i + 1) != 'B'){
      	ans += str.charAt(i);
      }
    }
    
    if(str.charAt(i) != 'B'){
    	ans += str.charAt(i);
    }
    
    System.out.println(ans);
  }
}