import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long k=sc.nextLong();
		long[] a=new long[n];
		long zero=0;
		long plus=0;
		long ma=0;
		ArrayList<Long> p=new ArrayList<>();
		ArrayList<Long> mai=new ArrayList<>();
		for(int i=0; i<n; i++){
			a[i]=sc.nextLong();
			if(a[i]>0){
				plus++;
				p.add(a[i]);
			}else if(a[i]<0){
				ma++;
				mai.add(a[i]);
			}else{
				zero++;
			}
		}
		long l=-1000000000000000000L;
		long r=1000000000000000001L;
		long mz=ma*plus+((n-1)*n/2-(n-zero)*(n-zero-1)/2);
		if(ma*plus>=k){
			r=0;
		}else if(mz>=k){
			System.out.println(0);
			return;
		}else{
			l=1;
		}
		Collections.sort(p);
		Collections.sort(mai);
		while(r-l>1){
			long m=(r+l)/2;
			long count=(m>0)?mz*2:0;
			for(int i=0; i<p.size(); i++){
				int in=0;
				if(m>0){
					in=binarySearch(p,m/p.get(i));
					if(in>=i+1){
						in--;
					}
				}else{
					in=binarySearch(mai,(m-p.get(i)+1)/p.get(i));
				}
				count+=in;
			}
			for(int i=0; i<mai.size(); i++){
				int in=0;
				if(m>0){
					in=mai.size()-binarySearch(mai,(m/mai.get(i))-1);
					if(mai.size()-in<=i){
						in--;
					}
				}else{
					in=p.size()-binarySearch(p,(m-1)/mai.get(i));
				}
				count+=in;
			}
			if(count/2<k){
				l=m;
			}else{
				r=m;
			}
		}
		System.out.println(r);
	}
	static int binarySearch(ArrayList<Long> t,long s){
		int l=-1;
		int r=t.size();
		while(r-l>1){
			int m=(r+l)/2;
			if(t.get(m)<=s){
				l=m;
			}else{
				r=m;
			}
		}
		return r;
	}
}
