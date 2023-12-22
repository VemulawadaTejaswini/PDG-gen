import java.util.*;

public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		long n=Integer.parseInt(scan.next());
		long m=Integer.parseInt(scan.next());
		if (n>2 || m>2){
			long ans=Math.max(1,n-2)*Math.max(1,m-2);
			System.out.print(ans);
		}else{
			System.out.print(2-n);
		}

	}
}
//end