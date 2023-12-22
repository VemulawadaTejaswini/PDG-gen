import java.util.Scanner;

/**
 * Created 2017/05/25.
 * nextLineの挙動とか
 */
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int b = sc.nexInt();
      int r = sc.nextInt();
     
      int s = b+r;
      int cnt = N / s;
      int mod = N % s;
      int p = 0 ;
        if(mod < b){
          p = mod;
        }else{
          p = b;
        }
	 int result = b * cnt + p;
     System.out.println(result);
   }
}