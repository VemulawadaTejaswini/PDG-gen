import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int need_num = 0;
		int tenclass = 0;
		String str = String.valueOf(n);
		for(int i=str.length()-2;i<str.length();i++) {
			tenclass += str.charAt(i)-48;
			if(i == str.length()-2) {
				tenclass *= 10;
			}
		}
		int hundred = str.charAt(0)-48;
		if(tenclass == 0) {
			System.out.println(1);
			System.exit(0);
		}else if(tenclass%6 == 0) {
			need_num = tenclass/6; 
		}else {
			need_num = tenclass/6+1;
		}
		
		if(hundred - need_num >= 0) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
		
	}

}
