import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long np=0;
		for(int i=1; i<=n; i++){
			np += i;
		}
		long[] a = new long[n];
		int even = 0;
		int odd = 0;
		long sum=0;
		int check=0;
		int dang=0;
		for(int i=0; i<n; i++){
			a[i] = sc.nextLong();
			if(a[i]==0){
				System.out.println("NO");
				return;
			}else if(a[i]==1){
				if(dang==1){
					System.out.println("NO");
					return;
				}else{
					dang = 1;
				}
			}
			if( a[i]%2==0 ){
				even++;
			}else{
				odd++;
			}
			sum = (sum+a[i]) % np;
		}

		check = Math.abs(odd-even)%n;
		if( n%2==0 ){
			if( check == 0 && sum == 0 ){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}else{
			if( (check == 1 || odd <= 1) && sum == 0 ){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
		return;
	}
}