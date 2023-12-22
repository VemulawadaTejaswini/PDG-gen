import java.util.*;
public class Main {
	static int a[];
	static int max;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		a = new int[n];
		for(int i=0;i<n;i++)a[i]=sc.nextInt();
		Arrays.sort(a);
		int len = a.length;
		max = a[len-1];
		
		int l=-1;
		int r=len;
		while(r>l+1) {
			int c = (l+r)/2;
			if(f(c)) r = c;
			else l = c;
		}
		int y = 0;
		int z = 0;
		if(2*a[l]-max>2*a[r]-max) {
			y = a[l];
			z = a[r];
		}
		else {
			y = a[r];
			z = a[l];
		}
		
		if(y==max) {
			y=z;
		}
		
		System.out.println(max+" "+y);
		
	}
	
	static boolean f(int c) {
		if (a[c]>max/2) return true;
		else return false;
	}
	
}
