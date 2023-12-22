import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		long max = 0;
		int p=0;
		for(int i=0; i<n; i++){
			a[i] = sc.nextLong();
		}
		
		while( !check(a) ){
			max=0;
			p=0;
			for(int i=0; i<n; i++){
				if(a[i] > max){
					max = a[i];
					p=i;
				}
			}

			for(int i=1; i<=n; i++){
				if(i+p>=n){
					a[i+p-n] -= i;
					if(a[i+p-n]<0){
						System.out.println("NO");
						return;
					}
				}else{
					a[i+p] -= i;
					if(a[i+p]<0){
						System.out.println("NO");
						return;
					}
				}
			}
		}
				
		System.out.println("YES");
		return;
	}

	static boolean check(long[] a){
		int n = a.length;
		for(int i=0; i<n; i++){
			if(a[i] != 0){
				return false;
			}
		}
		return true;
	}
}