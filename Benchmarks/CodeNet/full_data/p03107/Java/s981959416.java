import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int red =0;
    int blue = 0;
    for(int i=0; i<S.length(); i++){
      if(S.substring(i, i+1).equals("0")){
        //System.out.println(S.substring(i, i+1));
        red++;
      }else{
        blue++;
      }
    }
    System.out.println(Math.min(red, blue)*2);
  }
}

    
    