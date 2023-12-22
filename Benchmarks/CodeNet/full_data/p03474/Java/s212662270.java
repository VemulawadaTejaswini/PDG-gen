import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int a = sc.nextInt();
      int b = sc.nextInt();
      String s = sc.next();
      
      int s1;
      boolean ans = true;

      if(s.charAt(a)!='-'){
        System.out.println("No");
        System.exit(0);
      }

      for(int i =0;i<a;i++){
        s1 = (int)s.charAt(i);
        if(s1>=48&&s1<58){
          ans=true;
        }else{
          System.out.println("No");
          System.exit(0);
        }
      }

      for(int i =a+1;i<s.length();i++){
        s1 = (int)s.charAt(i);
        if(s1>=48&&s1<58){
          ans=true;
        }else{
          System.out.println("No");
          System.exit(0);
        }

      }
      if(ans){
        System.out.println("Yes");
      }

  }
}
