import java.util.*;

public class Main {
	
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n=Integer.parseInt(scan.next());
		int[] a=new int [n];
		for (int i=0;i<n;++i) {
			a[i]=Integer.parseInt(scan.next());
		}
		int sarch;
		for (int i=1;i<=n;++i) {
			for (int k=0;k<n;++k) {
				if (a[k]==i) {
					System.out.print(k+1+" ");
					
					break;
				}
			}
			
		}
}		
}
//end