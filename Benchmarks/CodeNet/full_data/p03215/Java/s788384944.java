import java.util.Scanner;
import java.util.ArrayList;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long[] a=new long[n];
		ArrayList<Long> list=new ArrayList<>();
		ArrayList<Long> re = new ArrayList<>();
		for(int i = 0; i<n; i++){
			a[i]=sc.nextLong();
		}
		for(int i =0; i<n; i++){
			long sum=0;
			for(int j=i; j<n; j++){
				sum+=a[j];
				list.add(sum);
			}
		}
		long ans=0;
		for(int i =40; i>=0; i--){
			re=new ArrayList<>();
			for(long j:list){
				if(((j>>i)&1)==1){
					re.add(j);
				}
			}
			if(re.size()>=k){
				ans+=1L<<i;
				list=re;
			}
		}
		System.out.println(ans);
	}
}
