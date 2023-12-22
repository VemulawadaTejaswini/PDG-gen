import java.util.Scanner;

class Main{



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int[] a = new int[n];
		int ans = 1000000000;
		for(int i = 0;i < n;i++){
			a[i] = sc.nextInt();
		}
		
		for(int i = -100;i <= 100;i++){
			int count = 0;
			for(int j = 0;j < n;j++){
				count += Math.abs(i-a[j])*Math.abs(i-a[j]);
			}
			ans = Math.min(ans, count);
		}
		System.out.println(ans);
		
		

	}
}