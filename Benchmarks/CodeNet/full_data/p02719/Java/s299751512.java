import java.util.*;

class Main{
	static public void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		long n=sc.nextLong();
		long k=sc.nextLong();
		long ans=n%k;
		
		ans=Math.min(ans,k-ans);
		
		System.out.println(ans);
	}
}