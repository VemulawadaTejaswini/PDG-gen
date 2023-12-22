import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc =  new Scanner(System.in);
		String str = sc.nextLine();

		String[] spl = str.split(" ");
		for(int i =0;i<3;i++){
			System.out.print(spl[i] = spl[i].substring(0, 1));
		}
		sc.close();
	}
}
