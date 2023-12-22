import java.util.*;
public class ABC97_B{

  public static void main(String agrs[]){
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    int ans = 1;
    for (int i = 0;i < x+1 ;i++ ) {
      if (i * i <= x) {
        ans = i * i;
      }
    }
    System.out.println(ans);
  }

}
