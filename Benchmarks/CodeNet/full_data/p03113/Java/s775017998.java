import java.util.ArrayList;
import java.util.Scanner;

/**
Son of Atcoder here :(
*/
public class Main {
	static int n,k;
	static int[] a=new int[55];
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		n=s.nextInt();
		k=s.nextInt();
		
		int sum=0;
		
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
			sum+=a[i];
		}
		
		if(sum<k) {
			System.out.println("-1");
			return;
		}
		
		ArrayList<Integer> ans=new ArrayList<>();
		
		while(true) {
			boolean ok=false;
			
			for(int i=0;i<n;i++) {
				if(a[i]!=0) {
					ans.add(i+1);
					a[i]--;
					ok=true;
				}
			}
			
			if(!ok) {
				break;
			}
		}
		
		System.out.println(ans.size());
		for(int i:ans) {
			System.out.print(i+" ");
		}
	}
}
