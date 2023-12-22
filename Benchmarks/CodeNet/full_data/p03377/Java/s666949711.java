import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();


        if(a+b<c){
          System.out.println("NO");
          System.exit(0);
        }
        if(a<=c){
          System.out.println("YES");
          System.exit(0);
        }
        if(a>c){
          System.out.println("NO");
          System.exit(0);
        }
  }
}