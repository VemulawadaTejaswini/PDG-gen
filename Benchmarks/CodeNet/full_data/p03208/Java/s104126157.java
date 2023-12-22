import java.util.*;

class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		long h[]=new long[n];
		long dif=1000000000L;
		
		
		for(int i=0;i<n;++i) {
			h[i]=sc.nextLong();
		}
		Arrays.sort(h);
		for(int i=0;i+k<=n;++i) {
			if(dif > h[i+k-1]-h[i]) {
				dif=h[i+k-1]-h[i];
			}
		}
		

		System.out.println(dif);
	}
}
