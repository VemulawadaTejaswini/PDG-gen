import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int Aplace =0;
    int Zplace =0;
    int len = S.length();
    for(int i=0;i<len;i++){
      if(S.substring(i,i+1).equals("A")){
        Aplace=i;
        break;
      }
    }
    for(int i=len;i>0;i--){
      if(S.substring(i-1,i).equals("Z")){
        Zplace=i;
        break;
      }
    }
    System.out.println(Zplace-Aplace);
  }
  

  
}