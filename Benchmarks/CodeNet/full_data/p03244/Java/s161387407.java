
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] odd = new int[n/2];
		int[] even = new int[n/2];

		for(int i = 0 ; i < n ; i++){
			if(i%2 != 0){
				odd[i/2] = sc.nextInt();
			}
			else{
				even[i/2] = sc.nextInt();
			}
		}

		sc.close();

		int[] checkodd = new int[100001];
		int[] checkeven = new int[100001];

		for(int i = 0 ; i < n/2 ; i++){
			checkodd[odd[i]] += 1;
			checkeven[even[i]] += 1;
		}

		int oddmax=0,evenmax=0,oddp=0,evenp=0;

		for(int i = 1 ; i <= 100000 ; i++){
			int oddtmp,eventmp;
			oddtmp = checkodd[i];
			eventmp = checkeven[i];

			if(oddmax < oddtmp){
				oddmax = oddtmp;
				oddp = i;
			}
			if(evenmax < eventmp){
				evenmax = eventmp;
				evenp = i;
			}
		}
/*
		System.out.println(oddmax);
		System.out.println(oddp);

		System.out.println(evenmax);
		System.out.println(evenp);
*/
		int ans = 0;

		if(oddmax == n/2 && evenmax == n/2){
			if(oddp == evenp){
				System.out.println(n/2);
			}
			else{
				System.out.println(0);
			}
		}

		else if(oddmax == n/2){
			System.out.println((n/2)-evenmax);
		}
		else if(evenmax == n/2){
			System.out.println((n/2)-oddmax);
		}
		else{
			System.out.println(n-oddmax-evenmax);
		}

	}
}