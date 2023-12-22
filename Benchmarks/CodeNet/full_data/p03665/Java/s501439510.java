
import java.util.Scanner;

class Main {

	public static long nCm(int n, int m){
		long ans = 1;
		for(int i = 0; i < m; i++){
			ans *= (long)(n - i);
			ans /= (long)(i + 1);
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int p = sc.nextInt();

		int a;
		int even = 0;
		int odd = 0;		
		for(int i=0; i<n; i++){
			a = sc.nextInt();
			if(a % 2 == 0){
				even++;
			}else if(a % 2 == 1){
				odd++;
			}
		}

		long oddComb = 0;
		long evenComb = 0;
		for(int i=0; i<=even; i++){
				evenComb += nCm(even,i);
		}
		if(p == 0){
			for(int i=0; i<=odd; i+=2){
				oddComb += nCm(odd,i);
			}

		}else if(p ==1){
			if(odd == 0){
				oddComb = 0;
			}else{
				for(int i=1; i<=odd; i+=2){
					oddComb += nCm(odd,i);
				}
			}
		}
		long ans = evenComb * oddComb;

		System.out.print(ans);
	}

}
