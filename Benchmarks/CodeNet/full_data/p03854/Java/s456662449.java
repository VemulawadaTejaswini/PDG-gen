import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String S = sc.nextLine();
    while(S.length() >= 5){
      if(S.substring(S.length()-5,S.length()).equals("dream")){
        S = new String(S.substring(0, S.length()-5));
      }else if(S.substring(S.length()-5, S.length()).equals("erase")){
        S = new String(S.substring(0, S.length()-5));
      }else if(S.substring(S.length()-6, S.length()).equals("eraser")){
        S = new String(S.substring(0, S.length()-6));
      }else if(S.substring(S.length()-7, S.length()).equals("dreamer")){
        S = new String(S.substring(0, S.length()-7));
      }else{
        break;
      }
    }
    
    String ans = "";
    if(S.length() == 0){
      ans = "YES";
    }else{
      ans = "NO";
    }
    System.out.println(ans);
  }
}