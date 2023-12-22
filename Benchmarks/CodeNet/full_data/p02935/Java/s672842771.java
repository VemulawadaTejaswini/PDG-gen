import java.util.*;

public class Main {
	
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		
		int n=Integer.parseInt(scan.next());
		double[]v=new double [n];
		for (int i=0;i<n;++i) {
			v[i]=Double.parseDouble(scan.next());
		}
		Arrays.parallelSort(v);
		
		double sum=0;
		for(int i=0;i<n;++i) {
			if (i==0) {
				sum+=(v[i]+v[i+1])/2;
				
			}else if (i==1)continue;
			
			else {
				sum=(sum+v[i])/2;
			}
			
		}
		
		System.out.print(sum);
}
}
//end