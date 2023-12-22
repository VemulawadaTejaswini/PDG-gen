import java.util.*;
public class Main {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      boolean c=false;
      for(int i=(int)Math.ceil(Math.sqrt((double)n));i>=1;i--)
      {
          if(n%i==0&&n/i>=1&&n/i<=9)
          {
              c=true;
              break;
          }
      }
      if(c)
      System.out.println("Yes");
      else
      System.out.println("No");
    }
}
