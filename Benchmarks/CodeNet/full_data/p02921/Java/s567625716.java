import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      String S = sc.nextLine();
      String T = sc.nextLine();

      char s;
      char t;
      int count = 0;



      for(int i = 0;i<S.length();i++){
        s = S.charAt(i);
        t = T.charAt(i);
        if(s==t){
          count++;
        }
      }

      System.out.println(count);

  }
}