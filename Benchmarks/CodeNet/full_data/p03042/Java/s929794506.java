import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
	
	void run() {
		int s = sc.nextInt();
		
		boolean yymm = isYYMM(s);
		boolean mmyy = isMMYY(s);
		
		if(yymm && !mmyy) {
			System.out.println("YYMM");
		}else if(mmyy && !yymm) {
			System.out.println("MMYY");
		}else if(mmyy && yymm) {
			System.out.println("ANBIGUOUS");
		}else {
			System.out.println("NA");
		}
		
		
	}
	
	boolean isYYMM(int str) {
		int mm = str % 100;
		if(mm >= 1 && mm <= 12) {
			return true;
		}
		return false;
	}
	
	boolean isMMYY(int str) {
		int mm = str / 100;
		if(mm >= 1 && mm <= 12) {
			return true;
		}
		return false;
	}
}
