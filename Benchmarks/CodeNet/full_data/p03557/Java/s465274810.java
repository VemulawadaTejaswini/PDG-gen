import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		int[] c=new int[n];
		for(int i=0; i<n; i++){
			a[i]=sc.nextInt();
		}
		for(int i=0; i<n; i++){
			b[i]=sc.nextInt();
		}
		for(int i=0; i<n; i++){
			c[i]=sc.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(c);
		Arrays.sort(b);
		long ans=0;
		for(int i=0; i<n; i++){
			long idxa=Arrays.binarySearch(a,b[i]);
			long idxc=Arrays.binarySearch(c,b[i]);
			if(idxa<0){
				idxa=(-idxa-1);
			}
			if(idxc<0){
				idxc=(n-(-idxc-1));
			}else{
				idxc=(n-idxc-1);
			}
			ans+=idxa*idxc;
		}
		System.out.println(ans);
	}
}
