import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =  sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int max = Math.max(c,Math.max(a, b));
		int sum=a+b+c;
		int ans=max*3-sum;
		if(ans%2==1) {
			ans=(max+1)*3-sum;
		}
		System.out.println(ans/2);
	}
}