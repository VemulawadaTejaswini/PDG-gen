import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int W=sc.nextInt();
      int H=sc.nextInt();
      int x=sc.nextInt();
      int y=sc.nextInt();


      int cnt=0;

      double S=W*H/2;

      if(x*2==W && y*2==H){
        cnt=1;
      }
      System.out.println(S+" "+cnt);

    }
}
