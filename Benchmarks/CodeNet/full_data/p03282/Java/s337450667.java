import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      Long n = sc.nextLong();
      boolean found = false;
      int ans = 0;
      for(int i = 0;i < s.length();i++){
          if(s.charAt(i) != '1'){
              ans = Character.getNumericValue(s.charAt(i));
              found = true;
              break;
          }
      }
      //sが全て1のとき
      if(!found){ans =Character.getNumericValue(s.charAt(0));}
      System.out.println(ans);
    }  
}