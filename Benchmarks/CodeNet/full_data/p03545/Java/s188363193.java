import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
	static Scanner sc;

	public static void main(String[] args) throws Exception {
		//InputStream in = new FileInputStream("src/input.txt");
		InputStream in = System.in;

		sc = new Scanner(in);

		String N = sc.next();

		int a = N.charAt(0) - '0';
		int b = N.charAt(1) - '0';
		int c = N.charAt(2) - '0';
		int d = N.charAt(3) - '0';

		for(int i = 0; i < 16; i++){
			String bin = String.format("%4s",Integer.toBinaryString(i)).replaceAll(" ", "0");
			//System.out.println(bin);
			int aa = bin.charAt(0) - '0';
			int bb = bin.charAt(1) - '0';
			int cc = bin.charAt(2) - '0';
			int dd = bin.charAt(3) - '0';
			aa=check(aa);
			bb=check(bb);
			cc=check(cc);
			dd=check(dd);
			//System.out.println(a*aa+b*bb+c*cc+d*dd);
			if(a*aa+b*bb+c*cc+d*dd == 7){
				System.out.println(a + out(bb) + b + out(cc) + c + out(dd) + d + "=7");
				break;
			}
		}
	}
	static int check(int i){
		if(i == 0){
			return -1;
		}else{
			return 1;
		}
	}

	static String out(int i){
		if(i == -1){
			return "-";
		}else{
			return "+";
		}
	}

}