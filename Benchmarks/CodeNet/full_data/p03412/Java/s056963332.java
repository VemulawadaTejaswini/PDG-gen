import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		Arrays.setAll(a,i->sc.nextInt());
		Arrays.setAll(b,i->sc.nextInt());
		long ans=0;
		for(int i=0; i<30; i++){
			int t=1<<i;
			int count=0;
			int[] aa=new int[n];
			int[] bb=new int[n];
			for(int j=0; j<n; j++){
				aa[j]=a[j]%(2*t);
				bb[j]=b[j]%(2*t);
			}
			Arrays.sort(bb);
			for(int k=0; k<n; k++){
				count+=lowerBounds(bb,2*t-aa[k])-lowerBounds(bb,t-aa[k]);
				count+=lowerBounds(bb,4*t-aa[k])-lowerBounds(bb,3*t-aa[k]);
			}
			ans|=(count & 1)<<i;
		}
		System.out.println(ans);
	}
	public static int lowerBounds(int[] arr,int value){
	int low=0;
	int high=arr.length;
	int mid;
	while(high-low>0){
		mid=(high+low)/2;
		if(arr[mid]<value){
			low=mid+1;
		}else{
			high=mid;
		}
	}
	return low;
}
}
