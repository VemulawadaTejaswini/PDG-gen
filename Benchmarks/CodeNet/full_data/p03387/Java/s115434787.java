import java.util.*;

public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int max=0;
		int a=Integer.parseInt(scan.next()); max=Math.max(max, a);
		int b=Integer.parseInt(scan.next()); max=Math.max(max, b);
		int c=Integer.parseInt(scan.next()); max=Math.max(max, c);

		int ans=0;
		while ((a+b+c)+2*ans<max*3 || ((a+b+c)+2*ans)%3!=0)++ans;

		System.out.print(ans);


	}
}
//end