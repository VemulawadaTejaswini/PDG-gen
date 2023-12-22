import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int a = Integer.parseInt(s.substring(0,2)),b=Integer.parseInt(s.substring(2));
		if(checkMM(a)  && checkMM(b)) {
			System.out.println("AMBIGUOUS");
		}else if(checkMM(a)){
			System.out.println("MMYY");
		}else if(checkMM(b)) {
			System.out.println("YYMM");
		}else {
			System.out.println("NA");
		}
	}

	public static boolean checkMM(int i) {
		if(i > 0 && i < 13) return true;
		return false;
	}
}