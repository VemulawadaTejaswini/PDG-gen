import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int K=scan.nextInt();
		String sinnsuu=Integer.toString(N,K);
		int keta=sinnsuu.length();
		System.out.println(keta);
	}

}
