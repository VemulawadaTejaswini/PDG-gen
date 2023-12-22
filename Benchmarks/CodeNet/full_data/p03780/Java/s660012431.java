
import java.util.*;
import java.io.*;
public class Main {

	private static final int m = 0;
	public static void main(String[] args) throws Exception  {
Scanner  sc=new Scanner(System.in);
PrintWriter out=new PrintWriter(System.out);
int n=sc.nextInt();
int k=sc.nextInt();
int a[]=new int[n];
long sum=0;
for(int i=0;i<n;i++) {
	a[i]=sc.nextInt();
	sum+=a[i];
}
if(sum<k) {
	System.out.println(n);
}else {
	ArrayList<Integer> aa=new ArrayList<>();
	for(int i=0;i<n;i++) {
		if(a[i]<k) {
			aa.add(a[i]);
		}
	}
	Collections.sort(aa);
long sum1=0;
	long count=0;
int ans=0;
//	for(int i=aa.size()-1;i>=0;i--) {
//		sum1+=aa.get(i);
//		
//		if(sum1<k) {
//			count++;
//		}else {
//			count++;
//			ans+=count;
//			sum1=0;
//			count=0;
//		}
//		
//	}
//	
Arrays.sort(a);
	for(int i=n-1;i>=0;i--) {
		sum1+=a[i];
		count++;
		if(sum1>=k) {
			ans+=count;
			sum1=0;
			count=0;
		}
	}

	System.out.println(n-ans);
}


		
		
	}
	}