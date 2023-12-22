
import java.util.*;

//	import java.text.*;

class helloworld{
	
	static int sch[][] = new int [105][10];
	
	static int pro[] = new int [1024];
	
	static int P[][] = new int [105][11];
	
	static int Y[] = new int [105];
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in); 
		
		int open[] = new int [10];
		
		int N,i,j,k;
		
		int max;
		
		N = scan.nextInt();
		
		for(i=0;i<N;i++)
			
			for(j=0;j<10;j++)
				
				sch[i][j] = scan.nextInt();
		
		for(i=0;i<N;i++)
			
			for(j=0;j<=10;j++)
				
				P[i][j] = scan.nextInt();
		
		for(i=1;i<1024;i++){
			
			for(k=0;k<N;k++)
				
			Y[k]=0;
			
			for(j=9;j>=0;j--){
				
				open[j]=(i>>(9-j))&1;
			}
			
			for(k=0;k<N;k++)
				
				for(j=0;j<10;j++)
					
					if(open[j]!=0&&sch[k][j]!=0) Y[k]++;
			
			for(k=0;k<N;k++)
				
			pro[i]+=P[k][Y[k]];
		}
		
		max=1;
		
		for(i=2;i<1024;i++)
			
			if(pro[max]<=pro[i]) max=i;
		
		System.out.println(pro[max]);
		
		scan.close();
		
		Runtime.getRuntime().exit(0);
			
	}
	
}

