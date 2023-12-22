import java.util.*;

public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n=Integer.parseInt(scan.next());
		int m=Integer.parseInt(scan.next());
		if (n>2 || m>2){
			int ans=Math.max(1,n-2)*Math.max(1,m-2);
			System.out.print(ans);
		}else{
			System.out.print(2-n);
		}

	}
}
//end