import java.util.Scanner;

public class Main {
	//問題A-Atcoder君とペンキ
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 1;
		int[] a = new int[3];//ペンキは３種類
		for (int i = 0; i < 3; i++) {
			a[i] = sc.nextInt();//入力
		}
		if (a[0]!=a[1]) {
			count++;
		}
		if(a[1]!=a[2]&&a[2]!=a[0]){
			count++;
		}
		System.out.println(count);//何種類あったかの合計
	}

}