import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();//人数
		int K = sc.nextInt();//身長
		int d[] = new int[N]; //配列数を決定
		
		for(int i = 0; i<N; i++) {
			d[i] = sc.nextInt(); //配列の中身を挿入
			//System.out.println(d[i]);//配列の中身を確認
		}
		int count = 0;
		for(int i = 0; i<N; i++) {
			if(d[i]>=K) {
				count += 1;
			}else {
				count += 0;
			}
		}
		System.out.println(count);
	}
	
}
