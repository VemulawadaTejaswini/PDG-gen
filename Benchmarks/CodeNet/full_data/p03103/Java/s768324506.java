import java.util.*;

public class Main {
	
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n=Integer.parseInt(scan.next());
		int m=Integer.parseInt(scan.next());
		int[][] ab=new int [n][2];
		for (int i=0;i<n;++i) {
			ab[i][0]=Integer.parseInt(scan.next());
			ab[i][1]=Integer.parseInt(scan.next());
		}
		Arrays.sort(ab,(a,b)->Integer.compare(a[0], b[0]));
		
		long sum=0;
		for(int i=0;i<n;++i) {
			if (m<=0)break;
			sum+=Math.min(ab[i][1], m)*(long)ab[i][0];
			m-=Math.min(ab[i][1], m);
		}
		System.out.print(sum);
}
}
//end
