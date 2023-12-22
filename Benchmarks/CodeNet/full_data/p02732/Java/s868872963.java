
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main{
	public static void f(){
		long ans=0;
		int x=0;
		for(int t:map.keySet()){
			x=map.get(t);
			if(x!=0){
				ans+=((x*(x-1))/2);
			}
		}
		System.out.println(ans);
	}
	public static HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int brr[]=new int[n+2];
		long cur[]=new long[n+2];
		long f[]=new long[n+2];
		long r[]=new long[n+2];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			brr[arr[i]]++;
		}
		for(int i=0;i<=n;i++){
			if(brr[i]<=1)continue;
			cur[i]=((brr[i]*(brr[i]-1))/2);
		}
		f[0]=cur[0];
		for(int i=1;i<=n;i++){
			f[i]=f[i-1]+cur[i];
		}
		r[n]=cur[n];
		for(int i=n-1;i>=0;i--){
			r[i]=r[i+1]+cur[i];
		}
		for(int i=0;i<n;i++){
			brr[arr[i]]--;
//			System.out.println(Arrays.toString(brr));
//			System.out.println(Arrays.toString(f));
//			System.out.println(Arrays.toString(r));
//			System.out.println(brr[arr[i]]*(brr[arr[i]]-1)/2);
			System.out.println(f[arr[i]-1]+(r[arr[i]+1])+(brr[arr[i]]*(brr[arr[i]]-1)/2));
			brr[arr[i]]++;
		}
	}
}
