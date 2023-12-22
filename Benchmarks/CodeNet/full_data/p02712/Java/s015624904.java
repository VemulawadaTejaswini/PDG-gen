import java.util.*;

public class Main {
	
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n=Integer.parseInt(scan.next());
		long sum=0;
		for (int i=0;i<=n;++i) {
			if (i%3!=0&&i%5!=0)sum+=i;
		}
		System.out.print(sum);
	
}
}
//end