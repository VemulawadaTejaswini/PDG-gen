import java.util.*;
public class Main {
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    int a,b,c;

    int A = sc.nextInt();
    int B = sc.nextInt();

    a = A+B;
    b = A-B;
    c = A*B;

    if((a>=b)&&(a>=c)){
      System.out.println(a);
      System.exit(0);
    }
    if((b>=a)&&(b>=c)){
      System.out.println(b);
      System.exit(0);
    }
    if((c>=a)&&(c>=b)){
      System.out.println(c);
      System.exit(0);
    }

  }
}