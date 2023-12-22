import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		long max = 0;
		int p=0;
		int pNext=0;
		for(int i=0; i<n; i++){
			a[i] = sc.nextLong();
		}
		for(int i=0; i<n; i++){
			if(a[i] > max){
				max = a[i];
				p=i;
			}
		}

		while( !check(a) ){
			max=0;
			for(int i=1; i<=n; i++){
				if(i+p>=n){
					a[i+p-n] -= i;
					if(a[i+p-n]<0){
						System.out.println("NO");
						return;
					}
					if(a[i+p-n] > max ){
						max = a[i+p-n];
						pNext = i+p-n;
					}

				}else{
					a[i+p] -= i;
					if(a[i+p]<0){
						System.out.println("NO");
						return;
					}
					if(a[i+p]>max){
						max = a[i+p];
						pNext = i+p;
					}
				}
			}
			p = pNext;
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