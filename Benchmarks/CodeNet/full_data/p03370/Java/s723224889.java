import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = scan.nextInt();
		int[] m = new int[n];
		int minM = 1000; //いちばん少ないコストで作れるドーナツ
		int zensyu=0;//全種類1個ずつ作ったときのコスト
		for(int i=0;i<n;i++) {
			m[i]=scan.nextInt();
			zensyu = zensyu + m[i];
			minM = Math.min(m[i], minM);
		}
	//	System.out.println(zensyu);
		//System.out.println(minM);
		System.out.println((x-zensyu)/minM + n);
	}

}
