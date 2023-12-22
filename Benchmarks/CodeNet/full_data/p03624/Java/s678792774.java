import java.util.*;
import java.util.Arrays;


public class Main{
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    boolean[] c = new boolean[26];
    for(int i=0;i<26;i++){
      c[s.charAt(i)-'a'] = true;
    }
    for(int i=0;i<26;i++){
      if(!c[i]){
        System.out.printf("%c\n",('a'+i));
        break;
      }

      else if(i==25){
        System.out.println("None");

      }
    }
    
  }
}
                          
                         
                    
    
    
    
    
    
    
