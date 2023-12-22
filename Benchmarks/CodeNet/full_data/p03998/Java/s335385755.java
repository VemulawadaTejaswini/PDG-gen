import java.util.*;
public class Main{
  public static void main(String[] args){
      Scanner st = new Scanner(System.in);
      String sa = st.next();
      String sb = st.next();
      String sc = st.next();
      int a = 0;
      int b = 0;
      int c = 0;
      char flag = 0;

      while(a<sa.length() && b<sb.length() && c<sc.length()){
          if(flag == 'a'){
              flag = sa.charAt(a);
              a++;

          }else if(flag == 'b'){
              flag = sb.charAt(b);
              b++;

          }else{
              flag = sc.charAt(c);
              c++;

          }
      } 
      System.out.println(Character.toUpperCase(flag));
  }
}