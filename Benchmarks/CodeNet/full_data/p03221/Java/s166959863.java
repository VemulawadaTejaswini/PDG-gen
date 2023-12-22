import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);



		int n=sc.nextInt();
		int m=sc.nextInt();
		long num[]= new long[m];
		int p[]=new int[m];
		long y[]=new long[m];
		long ny[][] = new long[n+1][m];
		int index[]=new int[n+1];
		int nyindex[][]=new int[n+1][m];
		Arrays.fill(index, 0);

		for(int i=0;i<m;++i){
			p[i]=sc.nextInt();
			y[i]=sc.nextLong();
			ny[p[i]][index[p[i]]]=y[i];
			nyindex[p[i]][index[p[i]]]=i;
			
			num[i]=1000001;


			for(int j=0;j<index[p[i]];++j){
				if(ny[p[i]][index[p[i]]]<ny[p[i]][j])++num[nyindex[p[i]][j]];
				else if(ny[p[i]][index[p[i]]]>ny[p[i]][j])++num[nyindex[p[i]][index[p[i]]]];
			}
			++index[p[i]];
		}

		for( int i=0;i<m;++i){
			String s=String.valueOf((long)1000000+p[i]);
			String s2=String.valueOf(num[i]);
			System.out.println(s.substring(1)+s2.substring(1));
		}
	}
}