import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
	    // 引数で標準入力System.inを指定する
	    Scanner scanner = new Scanner(System.in);
	    int R = scanner.nextInt();
	    
	    if((0 <= R)&&(R < 1200)) {
	    	System.out.println("ABC");
	    }else if ((1200 <= R)&&(R < 2800)) {
	    	System.out.println("ARC");
		}else {
			System.out.println("AGC");
		}

	    // Scannerクラスのインスタンスをクローズ
	    scanner.close();

	}

}