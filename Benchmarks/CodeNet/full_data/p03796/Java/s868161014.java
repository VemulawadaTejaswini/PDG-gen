
import java.util.*;
public class Main {

	private static final int m = 0;
	public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 int 	n=sc.nextInt();
 long ans=1;
 for(int i=2;i<=n;i++) {
 	ans=(ans*i)%1000000007;
 }
System.out.println(ans);
 
		
		
	}
}