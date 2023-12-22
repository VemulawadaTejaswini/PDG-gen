import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];
		for(int i=0; i<N; i++){
			a[i] = sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(a);	
		long ans = a[1]-a[0];
		for(int i=N-3; i>=0; i--){
			if(Math.abs(ans+a[i]) > Math.abs(ans-a[i])){
				ans = ans-a[i];
			}else{
				ans = ans+a[i];
			}
		}		
		System.out.println(Math.abs(ans));

	}

}