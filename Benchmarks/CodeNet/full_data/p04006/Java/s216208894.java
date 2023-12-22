import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		int N = s.nextInt();
		int x=s.nextInt();
		int[] a = new int[N];
		for(int i=0;i<N;i++){
			a[i]=s.nextInt();
		}
		int[] a2=new int[2*N];
		for(int i=0;i<N;i++){
			a2[i]=a[i];
		}
		for(int i=N;i<2*N;i++){
			a2[i]=a[i-N];
		}
		
		int minno=0;
		int amin=a[0];
		for(int i=1;i<N;i++){
			if(a[i]<amin){
				amin=a[i];
				minno=i;
			}
		}		
		
		int cmax=0;
		int ccount=0;
		int time=a2[minno];
		for(int i=minno;i<minno+N;i++){
			if(a2[i]<time+x){
				cmax=Math.max(cmax, ccount);
				ccount=0;
				time=a2[i];
			}else{
				time+=x;
				ccount++;
			}
		}
		cmax=Math.max(cmax, ccount);
		
		long sum=0;
		for(int i=N;i<2*N;i++){
			 int min=100000000;
			 for(int j=i;j>=i-cmax;j--){
				 min=Math.min(a2[j],min );
			 }
			 sum+=min;
		}
	
		System.out.println(sum+x*cmax);
	}
}