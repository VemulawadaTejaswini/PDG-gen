import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
//		List<Integer> list = new ArrayList<>();
		int[] tt = new int[N];

		for(int i=0; i<N; i++){
			tt[i]=sc.nextInt();
		}

		Arrays.sort(tt);

		int sum = 0;
		for(int i=0; i<tt.length; i++){
			sum = sum + tt[i];
		}
//		System.out.println("sum="+sum);

		if ((sum == 0) || (sum%10 != 0)){
			System.out.println(sum);
			return;
		}

		int t = sum;
		for(int i=0; i<tt.length; i++){
			for(int j=0;j<tt.length-2;j++){
				t = t - tt[i+j];
				if (t%10 != 0){
					System.out.println(t);
					return;
				}
			}
		}

		System.out.println("0");

	}

}
