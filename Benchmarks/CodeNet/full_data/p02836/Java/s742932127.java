import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      String s = sc.next();
      char c1;
      char c2;
      int count = 0;

      for (int i = 0;i<s.length()/2 ;i++ ) {

        c1 = s.charAt(i);
        c2 = s.charAt(s.length()-i-1);

        if(c1==c2){
          continue;
        }else{
          count++;
        }

      }
        System.out.println(count);


  }
}
