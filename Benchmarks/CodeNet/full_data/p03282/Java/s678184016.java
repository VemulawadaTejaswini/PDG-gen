import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String answer ="1";
    for(int i =0;i<s.length();i++){
      if(!s.substring(i,i+1).equals("1")){
        answer = s.substring(i,i+1);
        break;
      }
    }
    System.out.println(answer);
    
    
  }
  

  
}