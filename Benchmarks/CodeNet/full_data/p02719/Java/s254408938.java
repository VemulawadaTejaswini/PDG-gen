
import java.util.*;
public class Main {	
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		
		long n=sc.nextLong();
		long k=sc.nextLong();
		
		//int ans=0;
		
		while(n>k){
			n=n%k;
		}
		if(n<k){
			n=Math.min(n, k-n);
		}
		//System.out.println(ans);
		System.out.println(n);

}
	
}
