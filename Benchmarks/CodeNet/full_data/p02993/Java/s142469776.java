import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


			//Scannerクラスのインスタンスの生成
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
	        String str = Integer.toString(num);
	        String []r = str.split("");

	        if (r[0].equals(r[1]) || r[1].equals(r[2]) || r[2].equals(r[3])) {
	        	System.out.println("Bad");
	        } else {
	        	System.out.println("Good");
	        }

	}


}