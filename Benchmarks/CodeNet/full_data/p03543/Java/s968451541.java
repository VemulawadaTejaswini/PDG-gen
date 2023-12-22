import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      String n = sc.next();
      boolean ans =false;
      for(int i=0;i<2;i++){
        if(n.charAt(i)==n.charAt(i+1)){
          if(n.charAt(i+1)==n.charAt(i+2)){
            ans = true;
          }
        }
      }

      if(ans==true){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }

  }
}