import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();//データ数
		int p[] = new int[N]; //配列数を決定
		int count = 0;
		for(int i = 0; i<N; i++) {
			p[i] = sc.nextInt(); //配列の中身を挿入
			//System.out.println(d[i]);//配列の中身を確認
			if(p[i] != i+1) {
				count++;
			}
		}
		//System.out.println(count); //count数を確認
		if(count <= 2){
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
	
}
