import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int a = sc.nextInt();
      int b = sc.nextInt();
      String s = String.valueOf(b);

      a = a*10*(int)Math.pow(10,s.length()-1);

      for(int i = 0;i*i<=a+b;i++){
        if(a+b==i*i){
            System.out.println("Yes");
            System.exit(0);
        }
      }
      System.out.println("No");
  }
}