import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int count = 0;

      String s = String.valueOf(n);

      if(s.length()==1){
        System.out.println(n);
      }
      if(s.length()==2){
        System.out.println(9);
      }
      if(s.length()==3){
        for (int i = 100;i<=n ;i++ ) {
          count++;
        }
        System.out.println(9+count);
      }
      if(s.length()==4){
        System.out.println(9+999);
      }
      if(s.length()==5){
        for (int i = 10000;i<=n ;i++ ) {
          count++;
        }
        System.out.println(9+999+count);
      }
      if(s.length()==6){
        System.out.println(90909);
      }



  }
}
