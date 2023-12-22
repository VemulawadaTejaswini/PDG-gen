import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];
		for(int i=0; i<N; i++){
			a[i] = sc.nextInt();
		}
		sc.close();
		
		long ans = 0;
		Set<Integer> minus = new HashSet<>();
		for(int i=0; i<N; i++){
			if(a[i]<0){
				a[i] = -1*a[i];
				minus.add(a[i]);
			}
		}
		Arrays.sort(a);
		boolean ok = false;
		for(int i=N-1; i>0; i--){
			int n = minus.remove(a[i]) ? -a[i] : a[i] ;
			if( Math.abs(ans+n) > Math.abs(ans-n)){
				ok = true;
				ans = ans - n;
			}else{
				ans = ans + n;
			}
		}
		
		int n = minus.remove(a[0]) ? -a[0] : a[0] ;
		if(ok){
			ans = Math.abs(ans+n)>Math.abs(ans-n) ? ans - n : ans + n;
		}else{
			ans = ans - n;
		}
		System.out.println(Math.abs(ans));
		
	}

}