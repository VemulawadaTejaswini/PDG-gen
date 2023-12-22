import java.util.*;
public class Main{
	public static final Scanner sc = new Scanner(System.in);
  	public static void main(String[] arg){
		 int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt(), d=sc.nextInt();
         int n=sc.nextInt();
         a *= 4;
         b *= 2;
         int small = Math.min(a, b, c);
         int ans;
         if (small*2 <= d){
         	ans = small*n;
         }else{
         	ans = d*(n/2) + small*(n%2);
         }
         System.out.println(ans);
    }
}