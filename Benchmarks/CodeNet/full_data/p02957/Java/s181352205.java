import java.util.*;

public class Main{

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int a1,a2=0,b1,b2=0;

    for(int i = 0;i < 10000;i++) {

      a1 = a-i;
      a2 = Math.abs(a1);
      b1 = b-i;
      b2 = Math.abs(b1);

      if(a2 == b2) {
        System.out.println(i);
        break;
      }

    }

    if(a2 != b2) {
      System.out.println("IMPOSSIBLE");
    }

  }

}
