import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long[] a=new long[n];
		long[] b=new long[n];
		for(int i=0; i<n; i++){
			a[i]=sc.nextLong();
		}
		for(int i=0; i<n; i++){
			b[i]=sc.nextLong();
		}
		long[] fig=new long[29];
		for(int i=0; i<30; i++){
			long t=1<<i+1;
			long[] aa=new long[n];
			long[] bb=new long[n];
			for(int j=0; j<n; j++){
				aa[j]=a[j]%t;
				bb[j]=b[j]%t;
			}
			Arrays.sort(bb);
			for(int k=0; k<n; k++){
				int left=0;
				int right=n-1;
				if(t>>1-aa>=0){
					while(){
						int ty=(left+right)/2;
						if(b[ty]<(t>>1-aa)){
							left=ty;	
						}else{
							
						}
					}
				}else{
					
				}
			}
		}
	}
}
