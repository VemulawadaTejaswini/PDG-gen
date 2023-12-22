import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int[] N = new int[5];
		int[] n = new int[5];
		int res=0;

		for(int i = 0;i<5;i++) {
			N[i] = sc.nextInt();
			n[i] = N[i]%10;
		}

		int min = N[0]%10;
		int num = 0;

		for(int i = 1;i<5;i++) {
			if(min>n[i]) {
				min = N[i];
				num = i-1;
			}
		}
		for(int j = 0;j<5;j++) {
			if(n[j] != 0 && j!=num ) {
				res += N[j] - n[j] +10;
			}else if(j!=num)res += N[j];
			else if(j==num)res+= N[j];
		}

		System.out.println(res);
	}
}