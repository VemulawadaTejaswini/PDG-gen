import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		
		int[] a = new int[N];
		int maxNumber =0;
		for(int i=0 ; i<N ;i++) {
			a[i] = sc.nextInt();
			if(maxNumber < a[i]) {
				maxNumber = a[i];
			}
		}
		
		int maxM = maxNumber*1000 - 1;
		int maxAmount = 0;
		for(int i=0;i<=maxM;i++) {
			int amount = 0;
			for(int j=0 ; j<N ;j++) {
				amount += i % a[j];	
			}
			if(amount > maxAmount) {
				 maxAmount = amount;
			}
		}
		
		System.out.println(maxAmount);
	}
}
