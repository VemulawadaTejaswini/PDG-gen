import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		// 6 3
		// in: 1 2 3 4 5 6
		// out: 1 3 6 9 12 15
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		double[] sum = new double[n];
		double result = 0;
		for(int i = 0; i < n; i++){
			sum[i] = 0;
			sum[i] = (double)(scanner.nextInt()+1)/2;
			if(i!=0) sum[i]+=sum[i-1];
			if(i-k>=0) result = Math.max(result, sum[i]-sum[i-k]);
		}
		System.out.println(result);
	}

}
