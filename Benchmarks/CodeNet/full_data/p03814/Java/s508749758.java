import java.util.*;

public class Main{
  
  public static void main(String[] args){
  
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    char[] list = new char[str.length()];
    
    for(int i = 0; i < str.length(); ++i){
      list[i] = str.charAt(i);
    }
    
    int num1 = 0;
    int num2 = 0;
    for(int i = 0; i < list.length; ++i){
      char m = list[i];
      if(m == 'A'){
        num1 = i;
        break;
      }
     }
    for(int i = 0; i < list.length; ++i){
      char v = list[i];
      if(v == 'Z' && num2 < i){
        num2 = i;
      }
    }
    
    int count = 0;
    for(int i = num1; i <= num2; ++i){
      count++;
    }
   System.out.println(count);
  }  
}
