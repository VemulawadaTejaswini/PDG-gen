import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String Na = scan.nextLine();

		int N = Integer.parseInt(Na);
		int[] H = new int[N];
		int count =0;
		for(int n=1;n<N;n++) {
			H[n] = scan.nextInt();

			if(H[2]<=H[n] || H[n-1]<=H[n]){
				count=count+1;
			}
		}
		System.out.println(count);



	}

}