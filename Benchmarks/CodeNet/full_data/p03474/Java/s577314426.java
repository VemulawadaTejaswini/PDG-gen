import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int a = sc.nextInt();
      int b = sc.nextInt();
      String s = sc.next();

      String s1;
      String s2;

      s1 = s.substring(0,a);
      s2 = s.substring(a+1,s.length());

      if(a+b+1!=s.length()){
        System.out.println("No");
        System.exit(0);
      }
      if(s1.equals("-")||s2.equals("-")){
        System.out.println("No");
        System.exit(0);
      }

      if(s1.length()==a&&s2.length()==b){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }

  }
}
